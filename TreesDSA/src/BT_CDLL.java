public class BT_CDLL {
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    static Node head = null , prev = null;
    //Function to convert binary tree into circular doubly linked list.
    static Node bTreeToClist(Node root)
    {
        //your code here
        if(root == null)
            return null;

        bTreeToClist(root.left);

        if(prev == null)
            head = root;
        else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;

        bTreeToClist(root.right);

        head.left = prev;
        prev.right = head;
        return head;
    }

    public static void main(String[] args) {

    }
}
