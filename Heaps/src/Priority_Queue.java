import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args)
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        // Adding items to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);


        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());



        // Printing the top element again
        System.out.println(pq.peek());

        PriorityQueue<Integer> pq1
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        // Adding items to the pQueue using add()
        pq1.add(10);
        pq1.add(20);
        pq1.add(15);

        // Above PriorityQueue is stored as following
        //       20
        //      /  \
        //    10    15

        // Printing the top element of PriorityQueue
        System.out.println(pq1.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq1.poll());

        // Post poll() PriorityQueue looks like
        //       15
        //      /
        //    10

        // Printing the top element again
        System.out.println(pq1.peek());
    }
    }

