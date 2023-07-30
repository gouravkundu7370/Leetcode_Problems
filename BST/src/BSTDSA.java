public class BSTDSA {
    static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }
    public static Node insert(Node root, int x){
        if(root==null)
            return new Node(x);
        else if(root.key<x)
            root.right=insert(root.right,x);
        else if(root.key>x)
            root.left=insert(root.left,x);
        return root;
    }
    public static Node insertiter(Node root, int x){
        Node temp=new Node(x);
        Node parent=null,curr=root;
        while(curr!=null){
            parent=curr;
            if(curr.key>x)
                curr=curr.left;
            else if(curr.key<x)
                curr=curr.right;
            else
                return root;
        }
        if(parent==null)
            return temp;
        if(parent.key>x)
            parent.left=temp;
        else
            parent.right=temp;
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        int x=20;

        root=insert(root,x);
        inorder(root);
        System.out.println();
        int x1=20;

        if(search(root,x1))
            System.out.print("Found");
        else
            System.out.print("Not Found");
        System.out.println();
        root=delNode(root,x);
        inorder(root);
        System.out.println();

        System.out.print("Floor: "+(floor(root,17).key));
        System.out.println();
        System.out.print("Ceil: "+(ceil(root,17).key));


    }
    public static boolean search(Node root, int x){
        while(root!=null){
            if(root.key==x)
                return true;
            else if(root.key<x)
                root=root.right;
            else
                root=root.left;
        }
        return false;
    }
    public static boolean searchrec(Node root, int x){
        if(root==null)
            return false;
        if(root.key==x)
            return true;
        else if(root.key>x){
            return searchrec(root.left,x);
        }else{
            return searchrec(root.right,x);
        }
    }
    public static Node getSuccessor(Node curr){
        curr=curr.right;
        while(curr!=null && curr.left!=null)
            curr=curr.left;
        return curr;
    }

    public static Node delNode(Node root, int x){
        if(root==null)
            return null;
        if(root.key>x)
            root.left=delNode(root.left,x);
        else if(root.key<x)
            root.right=delNode(root.right,x);
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node succ=getSuccessor(root);
                root.key=succ.key;
                root.right=delNode(root.right,succ.key);
            }
        }
        return root;
    }
    public static Node floor(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key>x)
                root=root.left;
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    }
    public static Node ceil(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key<x)
                root=root.right;
            else{
                res=root;
                root=root.left;
            }
        }
        return res;
    }

}
