import java.util.ArrayList;

public class CommonNodeBST {
    static class Node {
        int key;
        Node left, right;
        Node(int x)
        {
            key = x;
            left = right = null;
        }
    }
    public static ArrayList<Integer> findCommon(Node root1, Node root2)
    {
        //code here
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        store(root1,list1);
        store(root2,list2);
        list1.retainAll(list2);
        return list1;
    }
    static void store(Node root, ArrayList<Integer> list){
        if(root == null) return;
        store(root.left, list);
        list.add(root.key);
        store(root.right,list);
    }

    public static void main(String[] args) {

    }
}
