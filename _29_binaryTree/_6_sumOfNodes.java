/*
Sum of Nodes

        1
       / \
      /   \
     2     3
    / \     \
   4   5     6

Ans --> 21
 */
public class _6_sumOfNodes {
    
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

        int sumOfNodes(Node root){

            if(root==null){
                return 0;
            }

            int leftSum =  sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;

        }
    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);
        System.out.println(b.sumOfNodes(root));
    }

}
