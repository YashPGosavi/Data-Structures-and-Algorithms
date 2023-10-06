/*
LinkedHashMap
keys are insertion ordered
 */

import java.util.*;

public class _5_linkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap <>();

        lhm.put("India",20);
        lhm.put("China",15);
        lhm.put("USA",5);

        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap <>();

        hm.put("India",20);
        hm.put("China",15);
        hm.put("USA",5);

        System.out.println(hm);



    }
    
}
