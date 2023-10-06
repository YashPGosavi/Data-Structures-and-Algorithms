/*
Iteration on HashSet
a. using Iterators :-  
        An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.

                    set.iterator()

        Looping Through a Collection
                To loop through a collection, use the hasNext() and next() methods of the Iterator

b. using Enhanced for loop :-

 */
import java.util.*;
public class _2_iterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Mumbai");
        hs.add("Delhi");
        hs.add("Pune");

        // a. using Iterators :- 
        Iterator<String> it = hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }


        // b. using Enhanced for loop :-

        for(String str : hs){
            System.out.print(str+" ");
        }
    }
}

