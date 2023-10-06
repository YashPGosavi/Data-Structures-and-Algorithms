
/*
For Example : given array is [4, 2, 5, 8, 5, 2, 2, 4, 4, 4] so, the array after the sorting will be [4, 4, 4, 4, 2, 2, 2, 5, 5, 8].
 */
import java.util.*;

public class _8_arrangeByMostAppear {

    public static void isAppearnace(int[] arr) {

        int[] ans = new int[arr.length];
        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]] += 1;
        }

        for (int i = 0; i < ans.length; i++) {
            int curr = ans[i];
            for (int j = 0; j < curr; j++) {
                ls.add(i);
            }
        }

        System.out.println(ls);

        Collections.sort(ls, new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                return Integer.compare(arr[j], arr[i]);
            }
        });

        for(int i : ls) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 8, 5, 2, 2, 4, 4, 4 };

        isAppearnace(arr);

}
}
