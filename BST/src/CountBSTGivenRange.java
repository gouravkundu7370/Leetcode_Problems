import java.util.LinkedList;
import java.util.Queue;

public class CountBSTGivenRange {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int k){
            data=k;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.right=new Node(18);
        System.out.println(getCount(root,5,17));

    }
  //Function to count number of nodes in BST that lie in the given range.
    static int getCount(Node root,int l, int h)
    {
        //Your code here
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            return 0;
        }
        q.add(root);
        int count =0;
        while(!q.isEmpty()){
            Node tem = q.remove();
            if(tem.data>=l && tem.data<=h){
                count++;
            }
            if(tem.left!=null){
                q.add(tem.left);
            }
            if(tem.right!=null){
                q.add(tem.right);
            }
        }
        return count;
    }
}
