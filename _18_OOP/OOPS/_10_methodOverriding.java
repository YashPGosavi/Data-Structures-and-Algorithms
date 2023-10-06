/*
Method Overriding / Function Overriding :- Multiple functions with the same name and same parameters

Method Overriding / Function Overriding :- Parent and child classes both contain the same function with a different definition.
 */
public class _10_methodOverriding {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();

        Deer d = new Deer();
        d.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("Eat anything");
    }
}

class Deer extends Animals {
    @Override
    void eat(){
        System.out.println("Eat grass");
    }
}