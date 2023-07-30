public class MinDiffNodeBST {
    static class Node {
        int data;
        Node left, right;
        Node(int x)
        {
            data = x;
            left = right = null;
        }
    }
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    public static int check(Node root, int m, int k){
        if(root == null) return Integer.MAX_VALUE;

        m = Math.min(m, Math.abs(root.data - k));

        int left = check(root.left, m, k);
        int right = check(root.right, m, k);

        return Math.min(m, Math.min(left, right));
    }

    static int minDiff(Node  root, int K) {
        int m = Integer.MAX_VALUE;
        return check(root, m, K);
    }

    public static void main(String[] args) {

    }
}
