import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoBST {
    static class Node
    {
        int data;
        Node left, right;

        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    //Function to return a list of integers denoting the node
    //values of both the BST in a sorted order.
    static ArrayList<Integer> ar=new ArrayList<>();
    public static List<Integer> merge(Node root1, Node root2)
    {
        // Write your code here
        treetraversal(root1);
        treetraversal(root2);
        Collections.sort(ar);
        return ar;
    }
    public static void treetraversal(Node root){
        if(root!=null){
            treetraversal(root.left);
            ar.add(root.data);
            treetraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        Node root1 = new Node(4);
        root1.left = new Node(2);
        root1.right = new Node(5);
        root1.left.left = new Node(1);
        root1.left.right = new Node(3);
        System.out.println(merge(root,root1));
    }

}
