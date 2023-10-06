/*
Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

S = "race" t = "care" --> TRUE

s = "heart" t = "earth" --> TRUE

s = "tulip" t = "lipid" --> FALSE

 */
import java.util.*;

public class _8_validAnagram {

    public static boolean anagram(String str1, String str2){
        HashMap<Character, Integer> hm = new HashMap<>();

        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++){
            char curr = str1.charAt(i);
            int count = 1;
            if(hm.containsKey(curr)){
                hm.put(curr, hm.get(curr)+count);
            }else{
                hm.put(curr, count);
            }
        }

        for(int i=0;i<str2.length();i++){
            char curr = str2.charAt(i);
            if(hm.containsKey(curr) && hm.get(curr)>1){
                hm.put(curr, hm.get(curr)-1);
            }else{
                hm.remove(curr);
            }
        }

      return hm.isEmpty();
    }
    public static void main(String[] args){
        String str1 = "cares";
        String str2 = "races";
        System.out.println(anagram(str1, str2));
    }
    
}
