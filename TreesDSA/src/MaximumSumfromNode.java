public class MaximumSumfromNode {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static int findMaxSum(Node node)
    {
        //your code goes here
        sum(node);
        return max;
    }
   static int max=Integer.MIN_VALUE;
    static int sum(Node node){
        if(node==null){
            return 0;
        }
        int left=Math.max(0,sum(node.left));
        int right=Math.max(0,sum(node.right));
        max=Math.max(max,left+right+node.data);
        return Math.max(left,right)+node.data;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(-25);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        System.out.println(findMaxSum(root));
    }
}
