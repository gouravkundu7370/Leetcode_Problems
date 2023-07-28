import java.util.ArrayDeque;
import java.util.Queue;

public class ConnectNodesSameLevel {
    static class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    public static void connect(Node root)
    {
        // Your code goes here.
        if(root==null)
            return;

        Queue<Node> pq=new ArrayDeque<>();
        pq.add(root);

        while(pq.size()>0)
        {
            int counter=pq.size();

            Node prev=null;
            for(int i=0;i<counter;i++)
            {
                Node top=pq.remove();
                top.nextRight=prev;

                prev=top;

                if(top.right!=null) // pahle push right
                    pq.add(top.right);

                if(top.left!=null)  // then push left
                    pq.add(top.left);
            }
        }

        return;
    }

    public static void main(String[] args) {

    }
}
