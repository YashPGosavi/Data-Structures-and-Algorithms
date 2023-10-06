public class _8_mirrorBST {
        
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

    // Mirror BST
    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }

        Node lMirror = mirrorBST(root.left);
        Node rMirror = mirrorBST(root.right);

        root.left = rMirror;
        root.right = lMirror;

        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
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


      Mirror

         5
        / \
       /   \ 
      7     1
             \  
              \
               3
              / \
             /   \
            4     2   

    */       
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        mirrorBST(root);
        preOrder(root);
    }
}


