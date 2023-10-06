
public class _2_queueUsingArray{

     static class Queue{

        static int arr[];
        int size;
        int rear;

        public Queue(int n){
             arr = new int [n];
             size = n;
             rear = -1;
        }

        // isEmpty()  O(1)
        public boolean isEmpty(){
            return rear==-1;
        }

        // add()  O(1)
        public void enqueue(int data){
            if(rear == arr.length-1){
                System.out.println("Full Queue...");
                return;
            }

            rear ++ ;
            arr[rear]= data;
        }

        // remove()  O(n)
        public int dequeue(){
            if(isEmpty()){
                System.out.println("Empty Queue...");
                return -1;
            }

            int result = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }

            rear--;
            return result;
        }
        
        // front()  O(1)
        public int peek(){
            return arr[0];
        }

    }
    public static void main(String[] args) {

        Queue q = new Queue(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}