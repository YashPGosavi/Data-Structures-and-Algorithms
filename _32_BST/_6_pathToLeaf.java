import java.util.*;

public class _6_pathToLeaf {
    
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else if (root.data < data) {
            root.right = insert(root.right, data);

        }
        return root;
    }

    public static void pathToLeaf(Node root, ArrayList<Integer> arr){

        if(root==null){
            return;
        }

  
        arr.add(root.data);

        if(root.left == null && root.right==null){
            System.out.println(arr);
        }
        
        pathToLeaf(root.left, arr);
        pathToLeaf(root.right,arr);
        arr.remove(arr.size()-1);
    }
    public static void main(String[] args) {
        /*

         5
        / \
       /   \ 
      1     7
       \  
        \
         3
        / \
       /   \
      2     4

    */        
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        ArrayList<Integer> arr = new ArrayList<>();

        pathToLeaf(root, arr);

    }
}
