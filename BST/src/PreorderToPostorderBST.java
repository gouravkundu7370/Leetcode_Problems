import java.util.Stack;

public class PreorderToPostorderBST {
    static class Node {
        int data;
        Node left, right;
        Node(int x)
        {
            data = x;
            left = right = null;
        }
    }
    public static Node post_order(int[] pre, int N)
    {
        //Your code here
        // it can be solved using just the upperbound as elements lesser than max will be taken in left subtree.
        Stack<Node> stack = new Stack<>();
        Node root = new Node(pre[0]);
        stack.push(root);
        for(int i=0, j=1; j<N; i++, j++) {
        /*
        40 30 20 35 80 100
              i. j (fix this with correct parent).
        */
            if(pre[i] > pre[j]) {
                Node leftNode = new Node(pre[j]);
                stack.peek().left = leftNode;
                stack.push(leftNode);
            } else {
                Node parent=null; // find correct parent of current element pre[j].
                while(!stack.isEmpty() && stack.peek().data < pre[j]) {
                    parent=stack.pop();
                }
                Node rightNode = new Node(pre[j]);
                parent.right=rightNode;
                stack.push(rightNode);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] arr  = {40,30,35,80,100};

        inorder(post_order(arr,arr.length));
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
