/*
Inset Into Heap
    1. Add at Last
    2. Fix Heap
 */

import java.util.*;
// Min Heap
public class _4_insertIntoHeap {

    static class Heap{
        ArrayList<Integer> arl = new ArrayList<>();

        // Add to heap
        public void add(int data){
            // add last
            arl.add(data);

            int child = arl.size()-1;
            int parent = child-1/2;

            while(arl.get(child)<arl.get(parent)){ // log(n)
                //swap
                int temp = arl.get(child);
                arl.set(child,arl.get(parent));
                arl.set(parent, temp);

                // Update values
                child = parent;
                parent = child -1 / 2;

            }
        }
    }
    public static void main(String[] args) {

    }
}
