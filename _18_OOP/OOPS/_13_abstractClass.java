/*
Abstract Class
    1. `abstract` keyword use as a prefix to create abstract class or abstract function.
    1. Cannot create create an instance of abstract class object.
    2. Can have abstract/non-abstract methods/function.
    3. Abstract methods/function but does not contain body/defination.
    4. Can have constructors.
 */
public class _13_abstractClass {
    public static void main(String[] args) {
        // Animal a = new Animal(); // Cannot create create an instance of abstract class object.

        Hourse h = new Hourse();
        h.eat();
        h.walk();

        Kangaru k = new Kangaru();
        k.eat();
        k.walk();
        System.out.println(k.color);

        // Mustang m =  new Mustang();
        // Animal-->Hourse --> Mustang
        /*
            Animal Constructor call
            Hourse constructor call
            Mustang constructor call
         */

    }
}

abstract class Animal {

    String color;

    Animal(){
        color="Brown";
        System.out.println("Animal Constructor call");
    }

     void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk(); // Abstract methods/function but does not contain body/defination.
}


class Hourse extends Animal {

    Hourse(){
        System.out.println("Hourse constructor call");
    }
    void changeColor(){
        color="Dark Brown";
    }
    void walk(){ // it is compulsury to define all the abstract methos in child class.
        System.out.println("Walk on Four legs");
    }
}

class Mustang extends Hourse{
    Mustang(){
        System.out.println("Mustang constructor call");
    }
}

class Kangaru extends Animal {
    void changeColor(){
        color="Light Brown";
    }
    void walk(){
        System.out.println("Walk on two legs");
    }
}