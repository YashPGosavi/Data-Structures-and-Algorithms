/*
Subtree of another Tree
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.


Tree
        1                  
       / \
      /   \
     2     3              
    / \     \
   4   5     6 


subTree
     2 
    / \
   4   5

 */
public class _9_subtreeOfAnotherTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

   

    public static boolean isIdentical(Node root, Node subroot){

        if(root == null && subroot == null){
            return true;
        }else if(root == null || subroot == null || root.data != subroot.data){
            return false;
        }

        if(!isIdentical(root.left, subroot.left)){
            return false;
        }

        if(!isIdentical(root.right, subroot.right)){
            return false;
        }

        return true;


    }

    public static boolean isSubTree(Node root, Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
           if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);

    }


    public static void main(String[] args) {

        /*  Tree
        1                  
       / \
      /   \
     2     3              
    / \     \
   4   5     6 

        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(3);

        /*
        subTree
        2 
       / \
      4   5
        */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        
        System.out.println(isSubTree(root, subroot));

    }
}
