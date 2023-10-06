/*
Indian Coins
We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
Find min no. of coins/notes to make change for a value V.
V = 121
ans = 3 (100+20+1)
V = 590
ans = 4 (500+50+20+20)
 */

import java.util.*;

public class _6_indianCoins {
    
    public static void main(String[] args) {
        Integer coins [] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amout = 1059;

        Arrays.sort(coins,Comparator.reverseOrder());

        int countOfCoin = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amout){
                while(coins[i]<=amout){
                    countOfCoin++;
                    ans.add(coins[i]);
                    amout -= coins[i];
                }
            }
        }

        System.out.println(ans + " -> " +countOfCoin);
    }
}
