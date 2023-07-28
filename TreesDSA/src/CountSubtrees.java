public class CountSubtrees {
    static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
   static int countSubtreesWithSumX(Node root, int X)
    {
        //Add your code here.
        if(root==null){
            return 0;
        }
        int l = countSubtreesWithSumX(root.left,X);  // This will collect number of subtrees having sum X on left
        int r = countSubtreesWithSumX(root.right,X); // This will collect number of subtrees having sum x on right
        // Here we're updating the root value by adding it's below children
        if(root.left!=null){
            root.data = root.data+root.left.data;
        }
        if(root.right!=null){
            root.data = root.data+root.right.data;
        }
        // Comparing the root value because we have already calculated the subtree sum above when we were updating root value
        if(root.data==X){
            return 1+l+r;
        }
        return l+r;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(-25);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        System.out.println(countSubtreesWithSumX(root,4));

    }
}
