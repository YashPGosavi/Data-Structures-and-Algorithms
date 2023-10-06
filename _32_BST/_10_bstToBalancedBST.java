import java.util.*;

/*
Convert BST to Balanced BST

         8
        / \
       6   10
      /      \
     5        11
    /          \
   3            12

Balanced BST   

          8
        /   \
       5     11
      / \    / \
     3   6  10  12

 */

public class _10_bstToBalancedBST{
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

    public static Node creatBST(ArrayList<Integer> arr, int s, int e) {
        if(s>e){
            return null;
        }

        int mid = (s+e)/2;

        Node root = new Node(arr.get(mid));

        root.left = creatBST(arr, s, mid-1);
        root.right = creatBST(arr, mid+1, e);

        return root;

    }

    public static void inorderArr(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        inorderArr(root.left,arr);
        arr.add(root.data);
        inorderArr(root.right,arr);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node (8) ;
        root.left = new Node(6);
        root.left.left = new Node (5);
        root.left.left.left = new Node (3) ;
        root.right = new Node (10) ;
        root.right.right = new Node (11);
        root.right.right.right = new Node (12);

        ArrayList<Integer> arr = new ArrayList<>();
        inorderArr(root,arr);

        Node root1 =  creatBST(arr, 0, arr.size()-1);

        preOrder(root1);

    }
}