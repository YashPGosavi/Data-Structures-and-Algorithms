import java.util.*;
public class _1_priorityQueue {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<> () ;

        pq.add(4); // O(log n)
        pq.add(3);
        pq.add(7);
        pq.add(1);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(n)
            pq.remove();// O(log n)
        }
    }
}
