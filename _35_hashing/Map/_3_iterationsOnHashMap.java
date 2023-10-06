import java.util.*;

public class _3_iterationsOnHashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Indian",10);
        hm.put("China",15);
        hm.put("us",50);


        // Interate 

        // hm.keySet() --> gives keys
        Set<String> key = hm.keySet();

        for(String k : key){
            System.out.println(k + "=" +hm.get(k));
        }


        // hm.entrySet --> directly gives value of the all key and values
    }
    
}
