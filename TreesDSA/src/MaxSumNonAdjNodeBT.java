import java.util.HashMap;

public class MaxSumNonAdjNodeBT {
    static class Node
    {
        int data;
        Node left, right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static HashMap<Node , Integer> mp= new HashMap<>();
    static int getMaxSum(Node root)
    {
        // add your code here
        if(root == null) return 0;
        if(mp.containsKey(root))
            return mp.get(root);
        int inc = root.data;
        int exc =0;
        if(root.left != null)
        {
            inc += getMaxSum(root.left.left);
            inc += getMaxSum(root.left.right);
        }
        if(root.right!=null)
        {
            inc += getMaxSum(root.right.left);
            inc += getMaxSum(root.right.right);
        }
        exc = getMaxSum(root.left)+getMaxSum(root.right);
        int ans  = Math.max(inc , exc);
        mp.put(root , ans);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(-25);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        System.out.println(getMaxSum(root));
    }
}
