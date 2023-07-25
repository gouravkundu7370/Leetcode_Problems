public class LinkedListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    public static void main(String[] args)
    {
        Node head1=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head1.next=temp1;
        temp1.next=temp2;
        System.out.print(head1.data+"-->"+temp1.data+"-->"+temp2.data);
        System.out.println();

        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        printlist(head);
        System.out.println();
        printList(head);

    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ");
        printList(head.next);
    }

}
