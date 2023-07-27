public class QueueImplementation {
    static class Queue {
        int front, rear, size;
        int capacity;
        int array[];

        public Queue(int capacity)
        {
            this.capacity = capacity;
            front = this.size = 0;
            rear = capacity - 1;
            array = new int[this.capacity];
        }


        boolean isFull(Queue queue)
        {
            return (queue.size == queue.capacity);
        }


        boolean isEmpty(Queue queue)
        {
            return (queue.size == 0);
        }


        void enqueue(int item)
        {
            if (isFull(this))
                return;
            this.rear = (this.rear + 1)
                    % this.capacity;
            this.array[this.rear] = item;
            this.size = this.size + 1;
            System.out.println(item
                    + " enqueued to queue");
        }


        int dequeue()
        {
            if (isEmpty(this))
                return Integer.MIN_VALUE;

            int item = this.array[this.front];
            this.front = (this.front + 1)
                    % this.capacity;
            this.size = this.size - 1;
            return item;
        }


        int front()
        {
            if (isEmpty(this))
                return Integer.MIN_VALUE;

            return this.array[this.front];
        }


        int rear()
        {
            if (isEmpty(this))
                return Integer.MIN_VALUE;

            return this.array[this.rear];
        }
    }
    static class Node {
        int key;
        Node next;


        public Node(int key)
        {
            this.key = key;
            this.next = null;
        }
    }

    static class Queue1 {
        Node front, rear;

        public Queue1()
        {
            this.front = this.rear = null;
        }


        void enqueue(int key)
        {


            Node temp = new Node(key);


            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }


            this.rear.next = temp;
            this.rear = temp;
        }


        void dequeue()
        {

            if (this.front == null)
                return;


            Node temp = this.front;
            this.front = this.front.next;


            if (this.front == null)
                this.rear = null;
        }
    }


    public static void main(String[] args)
    {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()
                + " dequeued from queue\n");

        System.out.println("Front item is "
                + queue.front());

        System.out.println("Rear item is "
                + queue.rear());


        Queue1 q = new Queue1();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);


    }
}
