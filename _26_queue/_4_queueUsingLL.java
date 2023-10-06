
public class _4_queueUsingLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    static class Queue {

        // isEmpty()
        public boolean isEmpty() {
            return head == null;
        }

        // add()
        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove()
        public int dequeue() {

            if (isEmpty()) {
                System.out.println("Empty Queue...");
                return -1;
            }

            if (head == tail) {
                int result = head.data;
                head = tail = null;
                return result;
            }
            int result = head.data;
            head = head.next;
            return result;
        }

        // front()
        public int peek() {
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

    }
}
