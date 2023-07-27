import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementsQueue {
    // Function to reverse first k elements of a queue.
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> s = new Stack<>();
        Queue<Integer> result = new LinkedList<>();
        int i = 0;
        while(i<k){
            s.push(q.remove());
            i++;
        }
        while(!s.isEmpty()){
            result.add(s.pop());
        }
        while(!q.isEmpty()){
            result.add(q.remove());
        }
        return result;
    }

    public static void main(String[] args) {
        Queue<Integer> ans = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            temp.add(i);
        }
        ans = modifyQueue(temp,3);
        for (int i = 1; i <=5 ; i++) {
            System.out.print(ans.poll());
        }
    }
}
