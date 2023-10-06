/*
Linked HashSet :- linkedHashMap use to implement linkedHashSet
        Ordered using DLL(Doubly Linked List)


Operatoins : O(n)
    1. add(key)
    2. contains(key)
    3. remove(key)
    4. size()
    5. clear()
    5. isEmpty()
    
 */

 import java.util.*;
public class _3_linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Mumbai");
        lhs.add("Pune");
        lhs.add("Delhi");

        System.out.println(lhs);
    }
}
