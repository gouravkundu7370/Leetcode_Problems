public class DoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;
        }
    }
    public static void main(String[] args)
    {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        printlist(head);
        System.out.println();
        head=insertBegin(head,5);
        printlist(head);
        System.out.println();
        head=insertEnd(head,40);
        printlist(head);
        System.out.println();
        head=reverse(head);
        printlist(head);
        System.out.println();
        head=reverse(head);
        printlist(head);
        System.out.println();
        head=delHead(head);
        printlist(head);
        System.out.println();
        head=delLast(head);
        printlist(head);
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
    static Node insertBegin(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        if(head!=null)head.prev=temp;
        return temp;
    }
    static Node insertEnd(Node head,int data){
        Node temp=new Node(data);
        if(head==null)return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }

    static Node reverse(Node head){
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        if(temp!=null)head=temp.prev;
        return head;
    }
    static Node delHead(Node head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    static Node delLast(Node head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        Node curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;

    }
}
