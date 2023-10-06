/*
Postorder Traversal

Algorithm
        1. Left Subtree
        2. Right Subtree
        3. Root

        1
       / \
      /   \
     2     3
    / \     \
   4   5     6

Ans --> Posrorder Traversal --> 4 5 2 6 3 1
 */

public class _3_postorderTraversal{

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

        static class BinaryTree{
           static  int idx = -1;

            public Node buildTree(int nodes[]){
                idx++;

                if(nodes[idx]==-1){
                    return null;
                }

                Node newNode = new Node(nodes[idx]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;

            }

            public void posrorder(Node root){
                if(root == null){
                    return;
                }

                posrorder(root.left);
                posrorder(root.right);
                System.out.print(root.data+" ");

            }
    }

    public static void main(String[] args) {
        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);
        b.posrorder(root);
    }
}