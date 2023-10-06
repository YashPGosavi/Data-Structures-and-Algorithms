import java.util.*;
/*
Time Complexity : O(n)
 */


public class _5_pushAtTheBottomOfTheStack{

    public static void pushBottom(Stack<Integer> s, int n){
        if(s.isEmpty()){
            return;
        }
        
        int o = s.pop();
        pushBottom(s, n);
        s.push(o);

    }
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(s,4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}