public class CountLengthLoopLL {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        int count = 0;
        Node slow= head,fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if(slow!=fast)
            return 0;
        do{
            fast =fast.next;
            count++;
        }while(fast.next != slow.next);
        return count;


    }

    public static void main(String[] args) {
        Node head=new Node(15);
        head.next=new Node(10);
        head.next.next=new Node(12);
        head.next.next.next=new Node(20);
        head.next.next.next.next=head.next;
        System.out.println(countNodesinLoop(head));
    }
}
