/*
HashMap :-
Pedifined framework of java
It is unordered Maps.
It is (key,value) pair, where key is always unique.

HashMap Operations TC = O(1)

    1. put(key, value)
    2. get(key)
    3. containsKey(key)
    4. remove(key)
    5. size()
    6. isEmpty()
    7. clear() --> empty the hashmap

 */

import java.util.*;
public class _2_hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        // put 
        hm.put("India",100);
        hm.put("China",150);
        hm.put("us",50);

        // get 
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonasia"));

        
        // containsKey --> Boolean ans
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonasia"));


        // remove --> remove both key and value
        hm.remove("us");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty()
        System.out.println(hm.isEmpty());

        // clear()
        hm.clear();

        System.out.println(hm.size());

    }
}
