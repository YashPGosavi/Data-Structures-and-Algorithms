/*
Multi Level Inheritance

        Base Class
            |
            |
       Derived Class
            |
            |
        Derived Class

 */
public class _3_multiLevelInheritace {
        public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();

        Dog d = new Dog();
        d.color="Brown";
        d.bread();
        d.legs();
        d.eat();
        d.breath();
    }

}

class Species {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

class Fishs extends Species {
    void fins() {
        System.out.println("Have Fins");
    }

    void swims() {
        System.out.println("Can Swim");
    }
}

class Mamales extends Species{
    void legs(){
        System.out.println("Have legs");
    }
}

class Dogs extends Mamales{
    void bread(){
        System.out.println("Have multiple breads");
    }
}

