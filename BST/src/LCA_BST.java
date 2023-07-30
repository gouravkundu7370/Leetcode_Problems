public class LCA_BST {
    static class Node {
        int data;
        Node left, right;
        Node(int x)
        {
            data = x;
            left = right = null;
        }
    }
    static Node LCA(Node root, int n1, int n2)
    {
        // code here.
        if(root==null){
            return null;
        }
        if(n1>root.data && n2>root.data){
            return LCA(root.right,n1,n2);
        }else if(n1<root.data && n2<root.data){
            return LCA(root.left,n1,n2);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        Node ans = LCA(root,20,30);
        
    }
}
