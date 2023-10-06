/*
Duplicate Parentheses : (Time Complexity O(n))
Given a balanced expression, find if it contains duplicate parentheses or not. A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
Return a true if it contains duplicates else return false.
example : (((a + (b))) + (c + d)) --> true
example : ((((a) + (b)) + C + d) ) --> true
example : ((a + b) + ( C + d) ) --> false
example : (((a + b)) + G ) --> true

 */

import java.util.*;

public class _11_duplicateParanthesis {

    public static boolean duplicateParanthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ')') {
                s.push(ch);
            } else {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count == 0) {
                    return true;
                }
                s.pop();
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((atb))"; //true
        String str2 = "(a-b)"; //false
        System.out.println("is duplicate paranthesis is present in ((atb)) :- "+duplicateParanthesis(str1));
        System.out.println("is duplicate paranthesis is present in (a-b) :- "+duplicateParanthesis(str2));

    }
}