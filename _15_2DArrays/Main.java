/*

Input = {4, 4, 4, 2, 2, 5, 5, 5, 5, 1, 1, 1, 1, 1, 6, 8}
Output = {1, 1, 1, 1, 1, 5, 5, 5, 5, 4, 4, 4, 2, 2, 6, 8}

 */

import java.util.*;

public class Main{

    public static int[] sordByCount(int[]arr){

        HashMap <Integer,Integer> hm = new HashMap<>();

        for(int n: arr){
            hm.put(n,hm.getorDefault(n,0)+1);
        }
        
        
    }
    public static void main(String[] args) {
        int [] Input = {4,4,4,2,2,5,5,5,5,1,1,1,1,1,6,8};
        sordByCount(Input);
    }    
}
