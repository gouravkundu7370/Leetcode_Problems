import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
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
    public static void main(String[] args)
    {
        Node root=new Node(20);
        root.left=new Node(80);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        System.out.println(maxDepth(root));
        System.out.println(getSize(root));
        System.out.println(getMax(root));
        System.out.println(maxWidth(root));
        System.out.println("Height: "+height(root));
        System.out.println("Diameter: "+res);
        System.out.println(zigZagTraversal(root));
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    static int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    public static int getSize(Node root){
        if(root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
    }
    public static int getMax(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        else
            return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
    }
    public static int maxWidth(Node root){
        if(root==null)return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(!q.isEmpty()){
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
    }
    static int res=0;
    public static int height(Node root){
        if(root==null)
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        res=Math.max(res,1+lh+rh);

        return 1+Math.max(lh,rh);
    }
    static ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        s2.add(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                list.add(temp.key);

                if (temp.right != null)
                    s2.add(temp.right);

                if (temp.left != null)
                    s2.add(temp.left);
            }

            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                list.add(temp.key);

                if (temp.left != null)
                    s1.add(temp.left);
                if (temp.right != null)
                    s1.add(temp.right);
            }
        }
        return list;
    }

}
