/*

Diameter of a Tree :- Number of Nodes in the Longest path between any 2 nodes

        1                 Level 1
       / \
      /   \
     2     3              Level 2
    / \     \
   4   5     6            Level 3


Case 1 : Diameter goes through root

Case 2 : Diameter does not goes through roit


Two Approches of solving

   
 */
public class _8_diameterOfTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    static class BinaryTree {

        static int idx = -1;

        Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        static int heightOfTree(Node root){
            if(root==null){
                return 0;
            }

            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            int maxHeight = Math.max(leftHeight, rightHeight)+1;

            return maxHeight;
        }

        // Approch 1 --> TC=O(n^2)



        // Approch 2 --> O(n)

        public int diameterOfTree(Node root){

            if(root == null){
                return 0;
            }

            int leftDiameter = diameterOfTree(root.left);
            int rightDiameter = diameterOfTree(root.right);

            int fullDiameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

            return Math.max(fullDiameter, Math.max(leftDiameter, rightDiameter));

        }



    }
        public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);

        System.out.println(b.diameterOfTree(root));

    }
    
}
