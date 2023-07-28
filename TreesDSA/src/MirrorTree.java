public class MirrorTree {
    static class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    public static void mirror(Node node) {
        // Your code here
        if(node == null){
            return;
        }
        //reverse of inorder
        Node temp = node.left;
        mirror(node.right);
        node.left = node.right;
        mirror(temp);
        node.right = temp;
    }

    public static void main(String[] args) {

        Node root=new Node(20);
        root.left=new Node(80);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        inorder(root);
        System.out.println();
        mirror(root);
        System.out.println();
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
