/*
Inorder Traversal

Algorithm :

    1. Left Subtree
    2. Root
    3. Right Subtree

        1
       / \
      /   \
     2     3
    / \     \
   4   5     6

Ans --> Inorder Traversal --> 4 2 5 1 3 6


 */

public class _2_inorderTraversal {

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
            int idx = -1;
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

            public void inorder(Node root){
                if(root == null){
                    return;
                }
                inorder(root.left);
                System.out.print(root.data+" ");
                inorder(root.right);
            }
    }

    public static void main(String [] args){
        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);

        // b.preorder(root);
        b.inorder(root);

    }
    
}
