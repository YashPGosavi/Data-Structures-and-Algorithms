/*
Merge 2 BSTs

     2           9
    / \    +    / \
   1   4       3   12

   BST 1        BST 2

-->         3 
          /   \
         1      9
          \    /  \
           2  4   12
 */

import java.util.*;

public class _12_merge2BST {

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

    public static void inOrderArl(Node root, ArrayList<Integer> arl) {

        if (root == null) {
            return;
        }

        inOrderArl(root.left, arl);
        arl.add(root.data);
        inOrderArl(root.right, arl);

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(ArrayList<Integer> arl, int s, int e) {

        if (s > e) {
            return null;
        }

        int mid = (s + e) / 2;

        Node root = new Node(arl.get(mid));

        root.left = createBST(arl, s, mid - 1);
        root.right = createBST(arl, mid + 1, e);

        return root;
    }

    public static void main(String[] args) {


/*
     2           
    / \    
   1   4      

   BST 1
*/
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
/*
     9
    / \
   3   12

   BST 2
 */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        
        ArrayList<Integer> arl = new ArrayList<>();
        
        inOrderArl(root1, arl);
        inOrderArl(root2, arl);
        
        Collections.sort(arl);
        
        Node root = createBST(arl, 0, arl.size()-1);
        
        preOrder(root);


/*

-->         3 
          /   \
         1      9
          \    /  \
           2  4   12
 */

    }
}
