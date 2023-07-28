public class MaximumDifferenceBT {
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
    static int maxDiff(Node root)
    {
        //your code here
        diff(root);
        return res;
    }
    static int res=Integer.MIN_VALUE;
    static int diff(Node root)
    {
        if(root==null){return 900000;}
        int l=diff(root.left);
        int r=diff(root.right);
        int sum=Math.max(root.data-l,root.data-r);
        res=Math.max(res,sum);
        return Math.min(root.data,Math.min(l,r));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(-25);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        System.out.println(maxDiff(root));
    }
}
