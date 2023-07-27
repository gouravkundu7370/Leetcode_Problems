import java.util.ArrayDeque;

public class RotateDeque {

    //Function to rotate deque by k places in anti-clockwise direction.
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        //Your code here
        for(int i=0;i<k;i++){
            deque.offerLast(deque.pollFirst());
        }
    }

    //Function to rotate deque by k places in clockwise direction.
    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
    {
        //Your code here
        for(int i=0;i<k;i++){
            deque.offerFirst(deque.pollLast());
        }
    }

    public static void main(String[] args) {
        
    }
}
