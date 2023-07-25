public class MergeKsortedLL {
    static class Node
    {
        int data;
        Node next;

        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        //Add your code here.

        if(arr.length == 0) return null;

        return mergeKlists(arr, 0, arr.length - 1);
    }
    public static Node mergeTwo(Node l1, Node l2){
        if(l1== null)return l2;
        if(l2 == null) return l1;
        Node result = new Node(0);
        Node curr = result;
        Node c1 = l1;
        Node c2 = l2;
        while(c1!=null && c2!=null){
            if(c1.data < c2.data){
                curr.next = c1;
                c1 = c1.next;
            }else{
                curr.next = c2;
                c2 = c2.next;
            }
            curr = curr.next;
        }
        curr.next = c1!=null?c1:c2;
        return result.next;
    }
    public static Node mergeKlists(Node[] arr, int low, int high){
        if(low > high)return null;
        if(low == high) return arr[low];
        int mid = (low + high) / 2;
        Node left = mergeKlists(arr, low, mid);
        Node right = mergeKlists(arr, mid + 1, high);
        return mergeTwo(left, right);
    }

    public static void main(String[] args) {

    }
}
