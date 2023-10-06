/*
  Functional Interface & Lambda Expression
  
 */

// Lambda Expression

// Functional Method :- The interface must have only one abstract method. it helps to holds lambda expressoin.
/* 

    return-type method-name (para-list){ // Concreate Method
        // method name
    }

    return-type class-name (para-list){ // Constructor
        // method name
    }

    return-type class-name (para-list); // Anonimous Method


    (para-list)->{ // Lambda Expressoin
            //method-body
    };
*/

interface Transaction {
    public void withDraw(int amt);
}

public class _1_FunctionalInterfaceAndLambdaExpression {

    public static void main(String[] args) {

        // Lambda Expression -- > Anonymous Inner class transform into lambda experssion after removing it name and return type. 
        // In this case the interface must have the only one abstract method(Functional Method).
        Transaction obj = (int amt) -> 
        { 
                System.out.println("Amout is : " + amt);
        };

        obj.withDraw(10);

    }
}
