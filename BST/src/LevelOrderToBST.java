public class LevelOrderToBST {
    static class Node {
        int data;
        Node left, right;
        Node(int x)
        {
            data = x;
            left = right = null;
        }
    }
    public static Node constructBST(int[] arr)
    {
        //Write your code here
        Node node =new Node(arr[0]);
        for(int i=1;i<arr.length;i++){
            insert(node,arr[i]);
        }
        return node;
    }
    static Node insert(Node root,int key){
        if(root==null) return new Node(key);
        if(root.data<key)
            root.right=insert(root.right,key);
        else
            root.left=insert(root.left,key);
        return root;
    }

    public static void main(String[] args) {
        int N = 9;
        int[] BST = {7,4,12,3,6,8,1,5,10};
        Node root = constructBST(BST);
        inorder(root);

    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
