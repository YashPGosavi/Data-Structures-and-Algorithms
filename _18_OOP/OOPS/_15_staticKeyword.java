/*
Static Keyword :- static keyword in Java is used to share the same variable or method of a given class.
- Properties
- Functionsz
- Blocks
- Nested Classes
*/
public class _15_staticKeyword {
    public static void main(String[] args) {
        Student_info a = new Student_info();
        a.school="DP";
        a.getString();

        Student_info b = new Student_info();
        b.getString();
    }
}

class Student_info{
    String school="MGVK";
    String name;

    void setString(String a ){
        this.name=a;
    }

    void getString(){
        System.out.println(this.school);
    }

    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
}