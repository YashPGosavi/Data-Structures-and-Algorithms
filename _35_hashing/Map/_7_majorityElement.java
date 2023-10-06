/*
Majority Element : O(n)
Given an integer array of size n, find all elements that appear more than [ n/3 ] times.

nums[ ] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

nums[ ] = (1, 2);
 */

import java.util.*;

public class _7_majorityElement {

    public static void majorityElement(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], count);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + count);
            }
        }

        Set<Integer>key = hm.keySet();

        for (int k : key) {
            if (hm.get(k) > (arr.length / 3)) {
                System.out.println(k+" = "+ hm.get(k));
            }
        }

    }

    public static void main(String[] args) {

        int nums[] = { 1,2 };

        majorityElement(nums);
    }

}
