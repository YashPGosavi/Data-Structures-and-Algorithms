/*
Super Keyword :- super keyword is used to refer immediate parent class object.
1. to access parent's properties
2. to access parent's functions
3. to access parent's constructor

 */
public class _16_superKeyword {
    public static void main(String[] args) {

        child c = new child();
        c.end();

    }
}

class parent {
    parent() {
        System.out.println("parent class constructor");
    }

    void skin() {
        System.out.println("Brown");
    }
}

class child extends parent {
    child() {
        super();
        System.out.println("child class constructor");
    }

    public void end(){
        System.out.println("End");
    }
}