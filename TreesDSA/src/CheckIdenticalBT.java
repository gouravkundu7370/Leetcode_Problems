public class CheckIdenticalBT {
    static class Node{
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(T == null)
            return false;
        boolean left = isSubtree(T.left, S);
        boolean right = isSubtree(T.right, S);

        if(left || right)
            return true;

        return subTree(T,S);
    }
    public static boolean subTree(Node T, Node S) {
        if(T == null && S == null)
            return true;

        if(T == null || S == null)
            return false;

        boolean root = (T.data == S.data);
        boolean left = subTree(T.left, S.left);
        boolean right = subTree(T.right, S.right);

        return root && left && right;
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.right.left = new Node(4);
        Node root2 = new Node(3);
        root2.left = new Node(4);
        System.out.println(isSubtree(root1,root2));
    }
}
