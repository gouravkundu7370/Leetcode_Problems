import java.util.ArrayDeque;

public class ArrayDequeDSA {
    public static void main(String[] args)
    {
        // Creating empty ArrayDeque
        ArrayDeque<Integer> ad1
                = new ArrayDeque<Integer>();

        // Adding items to the ad using add()
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);

        System.out.println(ad1);

        ArrayDeque<Integer> ad  = new ArrayDeque<Integer>();

        // Add items to the ad using offer() at last
        ad.offer(10);
        ad.offer(20);

        // Returns the front of queue, 10
        System.out.println(ad.peek());

        // Returns and Removes the front of queue, 10
        System.out.println(ad.poll());

        // Returns the front of queue, 20
        System.out.println(ad.peek());

        // Adds 40 to last of queue
        ad.offer(40);

        // Returns the front of queue, 20
        System.out.println(ad.peek());
        // Pushing items to the ad using add()
        ad.push(10);
        ad.push(20);

        // Returns the top of stack, 20
        System.out.println(ad.peek());

        // Returns and Removes the top of stack, 20
        System.out.println(ad.pop());

        // Returns the top of stack, 10
        System.out.println(ad.peek());

        // Pushes 40
        ad.push(40);

        // Returns the top of stack, 40
        System.out.println(ad.peek());
        // Returns 30
        System.out.println(ad.peekFirst());

        // Returns 40
        System.out.println(ad.peekLast());

        // Returns and removes 30
        System.out.println(ad.pollFirst());

        // Returns 10
        System.out.println(ad.peekFirst());

        // Returns and removes 40
        System.out.println(ad.pollLast());

        // Returns 20
        System.out.println(ad.peekLast());
    }
}
