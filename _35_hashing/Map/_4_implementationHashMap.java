/*
Implementation HashMap
put()), get(), containsKey(), remove (), size()
 */
/*
Implementation HashMap
put()), get(), containsKey(), remove(), size() --> TC = 0(1)
 */
import java.util.*;

public class _4_implementationHashMap {

   static class HashMap<K, V> { // generic

      private class Node {
         K key;
         V value;

         public Node(K key, V value) {
            this.key = key;
            this.value = value;
         }
      }

      private static int n;
      private int N;
      private LinkedList<Node>[] buckets;

      @SuppressWarnings("unchecked")
      public HashMap() {
         this.N = 4;
         this.buckets = new LinkedList[4];

         for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
         }
      }

      private int hashFunction(K key) {
         int hashcode = key.hashCode();
         return Math.abs(hashcode) % N;
      }

      private int searchInLL(K key, int bi) {
         LinkedList<Node> ll = buckets[bi];
         int di = 0;

         for (int i = 0; i < ll.size(); i++) {
            Node newNode = ll.get(i);
            if (newNode.key == key) {
               return di;
            }
            di++;
         }
         return -1;
      }
         
      @SuppressWarnings("unchecked")
      
      private void rehash() {
         LinkedList<Node> oldBucket[] = buckets;

         buckets = new LinkedList[2 * N];
         N = 2 * N;

         for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
         }

         for (int i = 0; i < oldBucket.length; i++) {
            LinkedList<Node> ll = buckets[i];
            for (int j = 0; j < ll.size(); j++) {
               Node newNode = ll.remove();
               put(newNode.key, newNode.value);
            }
         }

      }

      public void put(K key, V value) {

         int bi = hashFunction(key);
         int di = searchInLL(key, bi);

         if (di != -1) {
            Node newNode = buckets[bi].get(di);
            newNode.value = value;
         } else {
            buckets[bi].add(new Node(key, value));
            n++;
         }

         double lambda = n / N;

         if (lambda > 2.0) {
            rehash();
         }
      }

      public boolean containsKey(K key) {

         int bi = hashFunction(key);

         int di = searchInLL(key, bi);

         if(di!=-1){
            return true;
         }

         return false;
      }

      public V remove(K key){
         int bi = hashFunction(key);
         int di = searchInLL(key, bi);

         if(di != -1){
            Node newNode = buckets[bi].remove(di);
            n--;
            return newNode.value;
         }else{
            return null;
         }

      }

      public V get(K key){
         int bi = hashFunction(key);
          int di = searchInLL(key, bi);

          if(bi!=-1){
            Node newNode = buckets[bi].get(di);
            return newNode.value;
          }else{
            return null;
          }
      }

      public ArrayList<K> keySet(){
         ArrayList <K> keys = new ArrayList<>();

         for(int i=0;i<buckets.length;i++){
            LinkedList<Node> ll  = buckets[i];
            for(Node node : ll){
               keys.add(node.key);
            }
         }
         return keys;
      }

      public boolean isEmpty(){
         return n==0;
      }
   }

   public static void main(String[] args) {

      HashMap<String, Integer> hm = new HashMap<>();

      hm.put("India", 100);
      hm.put("China", 150);
      hm.put("us", 50);

      System.out.println( hm.containsKey("India"));

      System.out.println(hm.remove("us"));


     

   }
}