public class Check_BST {
    static class Node {
        int key;
        Node left, right;
        Node(int x)
        {
            key = x;
            left = right = null;
        }
    }

    static int prev=Integer.MIN_VALUE;
    public static boolean isBST(Node root)
    {
        if (root == null)
            return true;

        if(!isBST(root.left))return false;

        if(root.key<=prev)return false;
        prev=root.key;

        return isBST(root.right);
    }

    public static void main(String[] args)
    {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        if (isBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }
}
