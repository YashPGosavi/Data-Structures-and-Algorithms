// public class _11_rotateAnArray {
    
//     public static void rotate(int arr[], int n, int k) {
//         int temp[] = new int[n];
//         int idx = 0;
//         int lastIdx = n - 1;

//         for (int i = k - 1; i >= 0; i--) {
//             temp[i] = arr[lastIdx];
//             lastIdx--;
//             idx++;
//         }

//         for (int i = 0; i <= lastIdx; i++) {
//             temp[idx] = arr[i];
//             idx++;
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }

//     }

//     public static void main(String args[]) throws Exception {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int N = 5;
//         int K = 2;

//         rotate(arr, N, K);

//         for (int i = 0; i < N; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }


public class _11_rotateAnArray {
    
    public static void rotate(int A[], int low, int high) {

        while(low<high){
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            low++;
            high--;
        }

    }

    public static void main(String args[]) throws Exception {
        int arr[] = { 1, 2, 3, 4, 5 };
        int N = 5;
        int K = 2;

        K = K%N;
        // rotate(arr, 0, N-K-1);
        // rotate(arr, N-K, N-1);
        // rotate(arr, 0,N-1);

            for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
