/*
TreeSet
    1. Implement using TreeMap
    2. Sorted in ascending order
    3. NULL values are NOT allowed

Operatoins : O(log n)
    1. add(key)
    2. contains(key)
    3. remove(key)
    4. size()
    5. clear()
    5. isEmpty()
    

 */

import java.util.*;
public class _4_treeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Mumbai");
        ts.add("Pune");
        ts.add("Delhi");

        System.out.println(ts);
    }
}
