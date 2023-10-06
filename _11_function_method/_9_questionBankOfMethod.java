// Question 1 : Write a Java method to compute the average of three numbers..

// Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

// public class _9_questionBank{
//     public static double avg(double a, double b, double c){
//         double sum = a+b+c;
//         double avg = sum/3;
//         return avg;
//     }

//     public static boolean isEven(int a){
//         if(a%2==0){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Three Numbers : ");
//         double a = sc.nextInt();
//         double b = sc.nextInt();
//         double c = sc.nextInt();
//         System.out.println("Average of "+a+" , "+ b +" , "+ c +" is : "+avg(a,b,c));
//         System.out.println("a is prime number : "+ isEven((int)a));
//         sc.close();
//     }
// }


// Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)
public class _9_questionBankOfMethod{
    public static void ispalin(int n){
        int palindrome=0;
        int input = n;
        while(n>0){
            int rem = n%10;
            palindrome = (palindrome*10) + rem;
            n = n/10;
        }

        System.out.println(palindrome);

        if(input==palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }

    public static boolean palindrome(String n){
        int l = n.length();
        for(int i=0;i<=l/2;i++){
            if(n.charAt(i)==n.charAt(l-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number : ");
        // int n = sc.nextInt();
        // ispalin(n);
        // sc.close();
        String a= "nitin";
        System.out.println(palindrome(a)); 
    }
}


/*
 * Question 4 : READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( ) b. Math.max( ) c. Math.sqrt( ) d. Math.pow( ) e. Math.avg( ) f. Math.abs( )
Free reading resource (https://www.javatpoint.com/java-math) Please feel free to look for more resources/websites on your own.
 */

 
// Question 5 : Write a Java method to compute the sum of the digits in an integer.

//  public class _9_questionBank{
//     public static void sumInt(int n){
//         int sumInt = 0;
//         System.out.print("Sum of int  ");
//         while(n>0){
//             int rem = n%10;
//             sumInt = sumInt + rem;
//             n=n/10; 
//             System.out.print(rem+ " , ");
//         }
//         System.out.println("is : "+sumInt);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number : ");
//         int n = sc.nextInt();
//         sumInt(n);
//         Random a =new Random();
//         int c = a.nextInt(1,5);
//         System.out.println(c);
//         sc.close();
//     }
//  }