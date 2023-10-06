/*
Union & Intersection of 2 arrays
arr1 = {7, 3, 9}
arr2 = {6, 3, 9, 2, 9, 4}
union = 6 (7, 3, 9, 6, 2, 4)
intersection = 2 (3, 9)
 */

import java.util.*;

public class _6_unionAndIntersaction {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        // Union
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        System.out.println("Union = "+hs.size());

        hs.clear();

        // Intersection

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
        }

        System.out.println("Intersection = "+count);

    }
}