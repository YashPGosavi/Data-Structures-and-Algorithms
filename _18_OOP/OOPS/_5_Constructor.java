/*
Constructors :- Constructor is a special method which is invoked automatically at the time of obiect creation.
    1. Constructors have the same name as class or structure.
    2. Constructors don't have a return type. (Not even void)
    3. Constructors are only called once, at object creation.
    4. Memory allocation happens when constructor is called.

Types of Constructors
    1. Non-parameterized :- Constructor with no Parameter
    2. Parameterized :- Constructor with Parameter
    3. Copy Constructor


Constructor Overloading :- More than One Constructor present in the class having different arguments called Constructor Overloading.
 */

public class _5_Constructor {
    public static void main(String[] args) {
        // Student_info S1 = new Student_info();  // Non Parameterised Constructor.
        Student_info S2 = new Student_info("Yash", 55);  // Parameterised Constructor.
        S2.marks[0]=45;
        S2.marks[1]=76;
        S2.marks[2]=34;

        Student_info S3 = new Student_info(); // Copy Constructor.
        S3.name="Bannu";
        S3.rollNo=54;
        S3.password="ABCDEFG";
        S3.marks[0]=78;
        S3.marks[1]=84;
        S3.marks[2]=89;

        for(int i=0;i<S3.marks.length;i++){
            System.out.println(S3.marks[i]);
        }

        System.out.println("Marks in S2");
        for(int i=0;i<S2.marks.length;i++){
            System.out.println(S2.marks[i]);
        }


    }
}
class Student_info {
    String name;
    int rollNo;
    String password;
    int marks[];

    Student_info() { // Non Parameterised Constructor.
        marks = new int[3];
        System.out.println("Non Parameterised Constructor. is called.");
        }

    Student_info(String name, int rollNo) { // Parameterised Constructor.
        marks = new int[3];
        this.name = name;
        this.rollNo = rollNo;
        System.out.println(name + " : " + rollNo);
    }

    Student_info(Student_info S3){ // Copy Constructor.
        marks = new int[3];
        this.name=S3.name;
        this.rollNo=S3.rollNo;
        this.password=S3.password;
        this.marks=S3.marks;
    }

}


