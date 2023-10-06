/*

Delete a Node

         5
        / \
       1   7 
        \
         3
        / \
       2   4

Case 1 :- No child (Leaf Node)
    Delete Node
    & Return Null to parent

    Example :- Delete 7

         5
        / 
       1    
        \
         3
        / \
       2   4

Case 2 :- One Child
    Delete Node
    & replace with child node    

    Example :- Delete 1

         5
        / \
       3   7 
      / \
     2   4

Case 3 :- Two Children
    Replace value with inorder successor
    Delete the node for inorder successor    

    Example :- Delete 3

         5
        / \
       1   7 
        \
         4
        / 
       2

 */

public class _4_deleteNodeInBST {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return null;
            }

            // case 3 - both children
            Node Insucc = inorderSuccsessor(root.right);
            root.data = Insucc.data;
            root.right = delete(root.right, Insucc.data);
        }
        return root;
    }

    public static Node inorderSuccsessor(Node root) {
        while (root.right != null) {
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void main(String[] args) {
        int values[] = { 5,1,7,3,2,4 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

    
        delete(root, 3);
        inOrder(root);

    }
}
