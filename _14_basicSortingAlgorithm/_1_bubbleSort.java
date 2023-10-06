/*
Sorting :- Arranging Item in order.

Bubble Sort :- large elements come to the end of array by swapping with adjacent elements, Time complexity( O(n^2) ).

 */
public class _1_bubbleSort {

        public static void bubbleSort(int[] arr) {
                int swap = 0;

                for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                                if (arr[j] > arr[j + 1]) {
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                        swap++;
                                }
                        }
                }

                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.println("Total Number of Swap is : " + swap);

        }

        // Optimize Bubble Sort

        /*
         * Time Complexity
         * 1. Worst Case :- O(n^2)
         * 2. Best Case :- O(n)
         * 
         */
        public static void modifiedBubbleSort(int arr[]) {
                for (int turn = 0; turn < arr.length - 1; turn++) {
                        boolean swapped = false;
                        for (int j = 0; j < arr.length - 1 - turn; j++) {
                                if (arr[j] > arr[j + 1]) {
                                        // swap
                                        int temp = arr[j];
                                        arr[j] = arr[j + 1];
                                        arr[j + 1] = temp;
                                        swapped = true;
                                }
                                if (swapped == false) {
                                        break;
                                }
                        }
                }
        }

        public static void main(String[] args) {
                int[] arr = { 5, 4, 1, 3, 2 };
                bubbleSort(arr);
        }

}