public class ConstructBT_from_ParArr {
    static class Node
    {
        int data;
        Node left, right;
        Node(int key)
        {
            data = key;
            left = right = null;
        }
    }
    public static Node createTree(int[] parent, int n)
    {
        //Your code here
        Node root = null;
        Node[] tree = new Node[n];
        for(int i=0;i<n;i++) {
            tree[i] = new Node(i);
        }
        for(int i=0;i<n;i++) {
            if(parent[i] == -1) {
                root = tree[i];
            }else {
                if(tree[parent[i]].left == null) {
                    tree[parent[i]].left = tree[i];
                }else {
                    tree[parent[i]].right = tree[i];
                }
            }
        }
        return root;

    }

    public static void main(String[] args) {
        int[] parent ={-1,0,0,1,1,3,5};
        Node root = createTree(parent,parent.length);
        inorder(root);

    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

}
