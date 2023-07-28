import java.util.ArrayList;

public class SerializeDeserializeBT {
    static class Node
    {
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }
    public static void main(String[] args)
    {
        Node root=new Node(10);
        root.left=new Node(20);

        ArrayList<Integer> arr=new ArrayList<>();
        serialize(root,arr);
        for (int x : arr) {
            System.out.print(x+" ");
        }


        Node root1=new Node(10);
        root.left=new Node(20);

        ArrayList<Integer> arr1=new ArrayList<>();
        serialize(root1,arr1);
        for (int x : arr1) {
            System.out.print(x+" ");
        }
        System.out.println();;
        Node root_new=deSerialize(arr1);
        inorder(root_new);

    }

    static final int EMPTY=-1;
    public static void serialize(Node root, ArrayList<Integer> arr){
        if(root==null){
            arr.add(EMPTY);
            return;
        }
        arr.add(root.key);
        serialize(root.left,arr);
        serialize(root.right,arr);
    }
    static int index=0;
    public static Node deSerialize(ArrayList<Integer> arr){
        if(index==arr.size())
            return null;
        int val=arr.get(index);
        index++;
        if(val==EMPTY)return null;
        Node root=new Node(val);
        root.left=deSerialize(arr);
        root.right=deSerialize(arr);
        return root;
    }

    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}
