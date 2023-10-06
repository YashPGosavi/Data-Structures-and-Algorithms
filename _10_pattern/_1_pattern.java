import java.util.Scanner;

/* 
Que. Print STAR pattern

* 
* *
* * *
* * * *

*/

// public class _1_pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of n : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//             sc.close();
//         }
//     }
// }


/*
 
Que. Print INVERTED-STAR pattern

* * * *
* * *
* *
*

 */

public class _1_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){ // column
            for(int j=i;j<=n;j++){ // row
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
Que. Print HALF-PYRAMID pattern

1
1 2
1 2 3
1 2 3 4

 */

//  public class _1_pattern{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of n : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // Column
//             for(int j=1;j<=i;j++){ // Row
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }



/*

Que.Print Character Pattern

A 
B C
D E F
G H E J

 */

//  public class _1_pattern{
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter value of n : ");
//             int n = sc.nextInt();
//             char A = 'A';
//             for(int i=1;i<=n;i++){
//                 for(int j=1;j<=i;j++){
//                     System.out.print(A+" ");
//                     A++;
//                 }
//                 System.out.println();
//             }
//             sc.close();
//         }
//     }