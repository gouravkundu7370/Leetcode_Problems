import java.util.Stack;

public class IterativeInorderTraversal {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }



    static void inorder(Node root) {
        if (root == null)
            return;


        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // Traverse the tree
        while (curr != null || s.size() > 0) {

            // Reach the left most Node of the
            // curr Node
            while (curr != null) {
                // Place pointer to a tree node on
                // the stack before traversing
                // the node's left subtree
                s.push(curr);
                curr = curr.left;
            }

            // Current must be NULL at this point
            curr = s.pop();

            System.out.print(curr.data + " ");

            // we have visited the node and its
            // left subtree. Now, it's right
            // subtree's turn
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.left.left.left=new Node(60);
        root.left.left.left.left=new Node(70);
        inorder(root);
    }
}
