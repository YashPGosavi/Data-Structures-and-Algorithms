/*
Preorder Traversal

In preorder traversal, first, root node is visited, then left sub-tree and after that right sub-tree is visited. The process of preorder traversal can be represented as -

root → left → right  

Root node is always traversed first in preorder traversal, while it is the last item of postorder traversal. Preorder traversal is used to get the prefix expression of a tree.

Algorithm

        1. First, visit the root node.
        2. Then, visit the left subtree.
        3. At last, visit the right subtree.


        1
       / \
      /   \
     2     3
    / \     \
   4   5     6


Ans -> Preorder Traversal  --> 1 2 4 5 3 6

 */

public class _2_preorderTraversal {

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

        static int idx = -1;
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

        public void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);
        b.preorder(root);

    }
    
}
