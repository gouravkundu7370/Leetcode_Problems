public class SwapKthLLend {
    static class Node  {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    static //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        if(K > num){
            return head;
        }
        Node parent = null;
        Node begin = head;
        for(int i = 1; i < K; i++){
            parent = begin;
            begin = begin.next;
        }
        Node parentEnd = null;
        int end = num - K + 1;
        Node endNode = head;
        for(int i = 1 ; i < end; i++){
            parentEnd = endNode;
            endNode = endNode.next;
        }
        if(parent != null){
            parent.next = endNode;
        }
        if(parentEnd != null){
            parentEnd.next = begin;
        }
        Node temp = endNode.next;
        endNode.next = begin.next;
        begin.next = temp;
        if(K == 1){
            return endNode;
        }else if(K == num){
            return begin;
        }else{
            return head;
        }
    }

    public static void main(String[] args) {
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);
        h1.next.next.next =new Node(4);
        printlist(swapkthnode(h1,4,1));

    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
