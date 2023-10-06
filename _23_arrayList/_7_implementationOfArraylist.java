import java.util.Iterator;

public class _7_implementationOfArraylist {

    @SuppressWarnings("unchecked")
    static class Array<T> implements Iterable<T> {
        private T[] arr;
        private int length;
        private int capacity;

        public Array() {
            this(16);
        }

        public Array(int capacity) {
            if (capacity < 0)
                throw new IllegalArgumentException("Illegal Capacity: " + capacity);

            this.capacity = capacity;
            arr = (T[]) new Object[capacity];
        }

        public int size() {
            return length;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public T get(int Index) {
            return arr[Index];
        }

        public void set(int Index, T element) {
            arr[Index] = element;
        }

        public void clear() {
            for (int i = 0; i < capacity; i++) {
                arr[i] = null;
            }
            length = 0;
        }

        public void add(T element) {
            if (length + 1 >= capacity) {
                if (capacity == 0) {
                    capacity = 1;
                } else {
                    capacity *= 2;
                }
                T[] temp = (T[]) new Object[capacity];
                for (int i = 0; i < length; i++) {
                    temp[i] = arr[i];
                }
                arr = temp;
            }
            arr[length++] = element;
        }

        public T removeAt(int index){
            if(index >= length && index < 0) throw new IndexOutOfBoundsException();
            T data = arr[index];

            T[] temp = (T[]) new Object[length-1];

            for(int i=0, j=0;i<length;i++,j++){
                if(i == index){
                    i++;
                    j--;
                }else{
                   temp[j] = arr[j];
                }
            }

            arr = temp;
            capacity = --length;
            return data;
        }

        public boolean remove(Object obj){
            for(int i=0;i<length;i++){
                if(arr[i]==obj){
                    removeAt(i);
                    return true;
                }
            }
            return false;
        }

        public int indexOf(Object obj){
            for(int i=0; i<length;i++){
                if(arr[i].equals(obj)){
                    return i;
                }
            }
            return -1;
        }

        public boolean contains(Object obj){
            return indexOf(obj) != -1;
        }

        @Override
        public Iterator<T> iterator() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'iterator'");
        }
        
    }

    public static void main(String[] args) {

    }
}
