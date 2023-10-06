/*
Next Greater Element
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
arr = [6, 8, 0, 1, 3]
next Greater = [8, -1, 1, 3, -1]
 */

import java.util.*;
public class _9_nextGreaterElement {

    public static void nextGreaterElement(int[] arr , int[] nGE){

        Stack<Integer> s = new Stack<>();
        // int[] nGE = new int[arr.length];
    
     for(int i = arr.length-1; i>=0;i--){

        // while
        while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
            s.pop();
        }

        // if--else
        if(s.isEmpty()){
            nGE[i]=-1;
        }else{
            nGE[i] = arr[s.peek()];
        }

        // push
        s.push(i);
     }
    }

    public static void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int[] arr= {6, 8, 0, 1, 3};
        int[] nGE = new int[arr.length];
        nextGreaterElement(arr, nGE);
        printArr(arr);
        System.out.println();
        printArr(nGE);
    }
}
