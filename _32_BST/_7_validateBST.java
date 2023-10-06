public class _7_validateBST {
    
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

    public static boolean isBST(Node root, Node min, Node max){

        if(root == null ){
            return true;
        }


        if( (min!=null && root.data < min.data) || (max!=null && root.data > max.data) ){
            return false;
        }
        return isBST(root.left, min, root) && isBST(root.right, root, max);
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

        System.out.println(isBST(root, null,null ));
        
    }
}
