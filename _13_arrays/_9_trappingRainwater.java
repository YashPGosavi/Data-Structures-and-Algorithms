/* 
Traped Rain-Water :- Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

(Waterlevel - Barlevel_Height) * Widhth = Traped_Rainwater;

Time Complexity :- O(n)
 */ 

 public class _9_trappingRainwater{
    public static int trappedRainWater(int[] height){
        int trappedRainWater = 0;
        int n = height.length;

        // leftmost Boudry
        int [] leftbound = new int[n];
        leftbound[0]=height[0];
        for(int i=1;i<n;i++){
            leftbound[i]=Math.max(height[i],leftbound[i-1]);
        }

        //rightmost Boundry
        int [] rightbound = new int[n];
        rightbound[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightbound[i]=Math.max(height[i],rightbound[i+1]);
        }

        //Trapped RainWater
        for(int i=0;i<n;i++){
            int Waterlevel = Math.min(leftbound[i],rightbound[i]);
            trappedRainWater += (Waterlevel - height[i]) * 1;
        }

        return trappedRainWater;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(height));
    }
 }