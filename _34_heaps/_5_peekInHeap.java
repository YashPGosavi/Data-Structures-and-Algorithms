import java.util.ArrayList;
// Min Heap
public class _5_peekInHeap {
    
    static class Heap{
        ArrayList<Integer> arl = new ArrayList<>();

        public void add(int data){
            arl.add(data);

            int child = arl.size()-1;
            int parent = child-1/2;

            while(arl.get(child)<arl.get(parent)){
                int temp = arl.get(child);

                arl.set(child,arl.get(parent));
                arl.set(parent, temp);

                child = parent;
                parent = (child -1) / 2;
            }
        }

        public int peek(){
            return arl.get(0);
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        int i = 0;
        while(i<h.arl.size()) {
            System.out.println(h.arl.get(i));
            i++;
        }
    }
}
