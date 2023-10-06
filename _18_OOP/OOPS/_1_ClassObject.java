/*
 Class cann't be private or protected.
 */

public class _1_ClassObject {
    public static void main(String[] args) {
         ColorPen p = new ColorPen(); // creating class object
         p.setColor("red"); // calling to the class method by object
         System.out.println("pen of the color is :"+p.color);

         Student_info st = new Student_info();
         st.claculatePercentage(12, 3, 2);
         System.out.println("Percentage is :"+st.percentage);

    }
 }

 class ColorPen {
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

 }

 class Student_info {
    String name;
    int age;
    float percentage;
    void claculatePercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }

 }