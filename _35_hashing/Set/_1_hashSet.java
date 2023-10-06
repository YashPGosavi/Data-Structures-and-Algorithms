/*
HashSet --> Use to store uniquw value, Implement using HashMap
    • no duplicates (unique)
    • unordered
    • NULL is allowed

Operatoins : O(n)
    1. add(key)
    2. contains(key)
    3. remove(key)
    4. size()
    5. clear()
    5. isEmpty()

 */
import java.util.*;
public class _1_hashSet {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);
        
        hs.remove(3);

        System.out.println(hs.contains(3));

        hs.clear();
        System.out.println(hs.size());



    }
    
}
