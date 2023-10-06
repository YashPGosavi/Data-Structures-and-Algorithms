/*
Count Distinct Elements
num = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1)
ans = 7
 */
import java.util.*;
 public class _5_countDistinctElement {

    public static void countDistinct(int [] arr){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        System.out.println(hs.size());
    }
    public static void main(String [] args){
        int num []= {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        countDistinct(num);

    }
    
}
