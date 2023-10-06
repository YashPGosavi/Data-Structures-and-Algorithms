/*
Delet from Heap
    1. Swap first and last node
    2. remove last idx
    3. fix heap (Heapify)

Heapify
    root = i
    left child = 2i+1
    right child = 2i+2
 */

import java.util.ArrayList;

// Min Heap
public class _6_deleteFromHeap {

    static class Heap {
        ArrayList<Integer> arl = new ArrayList<>();

        // Add
        public void add(int data) {
            arl.add(data);

            int child = arl.size() - 1;
            int parent = (child - 1) / 2;

            while (arl.get(child) < arl.get(parent)) {
                int temp = arl.get(child);
                arl.set(child, arl.get(parent));
                arl.set(parent, temp);

                child = parent;
                parent = (child - 1)/ 2;
            }
        }

        // Peek
        public int peek() {
            return arl.get(0);
        }

        // Heapify
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;
        
            if (left < arl.size() && arl.get(left) < arl.get(minIdx)) {
                minIdx = left;
            }
        
            if (right < arl.size() && arl.get(right) < arl.get(minIdx)) {
                minIdx = right;
            }
        
            if (minIdx != i) {
                int temp = arl.get(i);
                arl.set(i, arl.get(minIdx));
                arl.set(minIdx, temp);
        
                heapify(minIdx);
            }
        }

        // Remove
        public int remove() {
            int data = arl.get(0);

            // step 1 --> swap firt and last
            arl.set(0, arl.get(arl.size() - 1));
            arl.set(arl.size() - 1, data);

            // step 2 --> delete last
            arl.remove(arl.size() - 1);

            // step 3 --> heapify
            heapify(0);
            return data;
        }

        // isEmpty
        public boolean isEmpty() {
            return arl.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
