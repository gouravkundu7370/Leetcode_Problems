public class MergeSortDoubly {
    public static void main(String[] args) {

    }
    static class Node
    {
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        if (head == null || head.next == null) {
            return head;
        }
        Node second = split(head);

        head = sortDoubly(head);
        second = sortDoubly(second);

        return merge(head, second);
    }

    static Node split(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    static Node merge(Node first, Node second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }
}
