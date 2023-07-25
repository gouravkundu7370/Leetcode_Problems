import java.util.LinkedList;

public class LinkedListOperations {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class LinkedList {
        Node head;
        public void insertAtBegin(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        Node insertAtPos(Node head, int x, int pos) {
            Node temp = new Node(x);
            if (head == null) {
                if (pos == 1) return temp;
                else return head;
            }
            if (pos == 1) {
                temp.next = head;
                return temp;
            }
            Node curr = head;
            for (int i = 1; i < pos - 1; i++) {
                curr = curr.next;
                if (curr == null) {
                    System.out.println("Position out of range");
                    return head;
                }
            }
            temp.next = curr.next;
            curr.next = temp;
            return head;
        }
        void printlist(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(1);
        list.insertAtBegin(2);
        list.insertAtBegin(3);
        list.insertAtBegin(4);
        list.insertAtBegin(5);
        System.out.print("Linked List: ");
        list.printList();
        System.out.println();
        Node head=null;
        head=insertEnd(head,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
        printlist(head);
        System.out.println();
        LinkedList ll = new LinkedList();
        ll.printlist(head);
        head = ll.insertAtPos(head, 25, 2);
        ll.printlist(head);
        System.out.println();
        head=delHead(head);
        printlist(head);
        System.out.println();
        head=delTail(head);
        printlist(head);
        System.out.println();
        System.out.println("Position of element in Linked List: "+searchit(head,20));
        System.out.println("Position of element in Linked List: "+searchrec(head,20));
        System.out.println();
        System.out.print("Middle Position of element in Linked List: ");
        printMiddle(head);
        System.out.println();
        System.out.print("Nth node from end of Linked List: ");
        printNthFromEnd(head,2);
        System.out.println();
        head=reverse(head);
        printlist(head);
    }
    static void printNthFromEnd(Node head,int n){
        if(head==null)return;
        Node first=head;
        for(int i=0;i<n;i++){
            if(first==null)return;
            first=first.next;
        }
        Node second=head;
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.print(second.data);
    }
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node insertEnd(Node head, int x){
        Node temp=new Node(x);
        if(head==null)return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }

}
    static Node delHead(Node head){
        if(head==null)return null;
        else{
            return head.next;
        }
    }
    static Node delTail(Node head){
        if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }
    static int searchit(Node head, int x){
        int pos=1;
        Node curr=head;
        while(curr!=null){
            if(curr.data==x)
                return pos;
            else{
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
    static int searchrec(Node head, int x){
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=searchrec(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
    }
    static void printMiddle(Node head){
        if(head==null)return;
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
}
