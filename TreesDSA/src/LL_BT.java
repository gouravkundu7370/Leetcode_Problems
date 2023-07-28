import java.util.HashMap;

public class LL_BT {
    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int d){
            data=d;
            left=null;
            right=null;
        }
    }

    static class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
    public static Tree convert(Node head, Tree node) {
        // add code here.
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int i=0;
        while(head!=null)
        {
            hm.put(i++,head.data);
            head=head.next;
        }
        return solve(hm,0);
    }
    public static Tree solve(HashMap<Integer,Integer> hm,int i)
    {
        if(!hm.containsKey(i))
            return null;
        Tree tree=new Tree(hm.get(i));
        tree.left=solve(hm,2*i+1);
        tree.right=solve(hm,2*i+2);
        return tree;
    }

    public static void main(String[] args) {

    }
}
