public class AddTwoLL {
    static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;


    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        // reverse both list
        first=reverse(first);
        second=reverse(second);
        Node ans=null;
        int carry=0;
        while(first!=null && second!=null){
            int sum=first.data+second.data+carry;
            Node newNode=new Node(sum%10);
            carry=sum/10;
            // every node add begining  to the
            newNode.next=ans;
            ans=newNode;
            first=first.next;
            second=second.next;
        }
        // if first list remaining node then traverse first list
        while(first!=null){
            int sum=first.data+carry;
            Node newNode=new Node(sum%10);
            carry=sum/10;
            newNode.next=ans;
            ans=newNode;
            first=first.next;
        }
        // if second list have remaining node than traverse second list
        while(second!=null){
            int sum=second.data+carry;
            Node newNode =new Node(sum%10);
            carry=sum/10;
            newNode.next=ans;
            ans=newNode;
            second=second.next;
        }
        // if carry not zero than add carry at the starting of the list
        while(carry!=0){
            int sum=carry;
            Node newNode=new Node(sum%10);
            carry=sum/10;
            newNode.next=ans;
            ans=newNode;
        }
        return ans;

    }
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }

    }

    public static void main(String[] args) {

        Node h1 = new Node(4);
        h1.next = new Node(5);
        Node h2 = new Node(3);
        h2.next = new Node(4);
        h2.next.next =new Node(5);
        printlist(addTwoLists(h1,h2));

    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
