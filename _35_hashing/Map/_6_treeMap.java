/*
Tree Map :-  Implement using red-Black tree
keys are sorted
put, get, remove are O(logn)

 */

import java.util.*;

public class _6_treeMap {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",20);
        tm.put("China",15);
        tm.put("USA",5);

        System.out.println(tm);
    }
}
