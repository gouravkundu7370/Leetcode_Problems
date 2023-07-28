public class FoldableBT {
    static class Node
    {
        int data;
        Node left, right;
        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        Node root1 = new Node(10);
        root1.left = new Node(7);
        root1.right = new Node(15);
        root1.left.right = new Node(9);
        root1.right.left = new Node(11);
        System.out.println(IsFoldable(root1));
    }
    //Function to check whether a binary tree is foldable or not.
    static boolean IsFoldable(Node node)
    {
        // your code
        return node==null || foldable(node.left, node.right);
    }
    static boolean foldable(Node left,Node right){
        if(left == null || right == null) return left == right;
        return foldable(left.left,right.right) && foldable(left.right,right.left);
    }
}
