import java.util.*;

public class _3_comparibleAndComparator {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(32);
        l.add(85);
        l.add(97);
        l.add(69);
    
        Comparator <Integer> comp = (i,j) ->  i>j?1:-1;

        Collections.sort(l,comp);

        for(Object e : l){
            System.out.println(e);
        }
    }
}
