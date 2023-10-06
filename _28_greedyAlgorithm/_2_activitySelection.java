/*
Activity Selection
You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.
start = [10, 12, 20]
end = [20, 25, 30]
ans = 2 (A0 & A2)
 */

 import java.util.*;

// public class _2_activitySelection { // O(n)

//     public static void main(String[] args) {
//         int start[] = { 1, 3, 0, 5, 8, 5 };
//         int end[] = { 2, 4, 6, 7, 9, 9 };
//         // end time basis sorted

//         int maxAct;
//         int lastEnd;

//         ArrayList<Integer> ans = new ArrayList<>();

//         ans.add(0);
//         maxAct = 1;
//         lastEnd = end[0];

//         for(int i=0;i<end.length;i++){
//             if(start[i]>=lastEnd){
//                 ans.add(i);
//                 maxAct++;
//                 lastEnd = end[i];
//             }
//         }

//         System.out.println(ans);
//         System.out.println(maxAct);
//     }

// }


// If not sorted

public class _2_activitySelection { // O(n log n)

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int [][]activities = new int[end.length][3];

        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform

        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxAct;
        int lastEnd;

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activities[0][0]);
        maxAct = 1;
        lastEnd = activities[0][2];

        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                ans.add(activities[i][0]);
                maxAct++;
                lastEnd = activities[i][2];
            }
        }

        System.out.println(ans);
        System.out.println(maxAct);
    }

}
