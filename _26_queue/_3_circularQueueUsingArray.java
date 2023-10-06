/*
*Circular Queue :- Initially the queue is empty and hence Front and rear point to the same location.

Applications of circular queue
        • Traffic light functioning is the best example for circular queues. The colors in the traffic light follow a circular pattern.
        • In page replacement algorithms, a circular list of pages is maintained and when a page needs to be replaced, the page in the front of the queue will be chosen.
 */
public class _3_circularQueueUsingArray {

    static class Queue {
        static int[] arr;
        int front;
        int size;
        int rear;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty()

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull()
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add()
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Full Queue...");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove()

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Empty Queue...");
                return -1;
            }
            int result = arr[front];

            if(rear==front){
                rear = front = -1;
            }else{
            front = (front + 1) % size;
            }
            return result;
        }

        // front()
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue...");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.dequeue());
        q.enqueue(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
