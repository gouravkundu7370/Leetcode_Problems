public class RotateLL {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node rotate(Node head, int k) {
        // add code here
        Node tem = head;
        for(int i =1; i<k;i++){
            tem = tem.next;
        }
        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        head = tem.next;
        tem.next =null;
        return head;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(9);
        printlist(rotate(head,3));
    }
}
