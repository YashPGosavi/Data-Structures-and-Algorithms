
/*
Question 
Queue using 2 Stacks
 */
import java.util.*;

public class _6_queuseUsingTwoStack {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // isEmpty()
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add()
        public void enqueue(int data) {
            if (isEmpty()) {
                s1.push(data);
                return;
            } else {
                while (!s1.isEmpty()) {
                    int curr = s1.pop();
                    s2.push(curr);
                }
                s1.push(data);
                while (!s2.isEmpty()) {
                    int curr = s2.pop();
                    s1.push(curr);
                }
            }

        }

        // remove()
        public int dequeue(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }

        // peek()
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
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
