/*
Max Area in Histogram // 0 (n)

Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
heights = {2,1,5,6,2,3}
 */

import java.util.*;

public class _12_maxAreaHistrogram {

    public static int maxArea(int[] arr) {

        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // Next smaller Left

        s = new Stack<>();
        for (int i = 0 ; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // Max area

        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int whidth = nsr[i]-nsl[i]-1;
            int currArea = whidth*height;

            maxArea = Math.max(maxArea,currArea);
        
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(heights));
    }
}
