/*
Levelorder Traversal

        1
       / \
      /   \
     2     3
    / \     \
   4   5     6

Ans --> Levelorder Traversal --> 1 2 3 4 5 6

 */

import java.util.*;

public class _4_levelorderTraversal {

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

        void levelorder(Node root) {

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println(); 
                    if (q.isEmpty()) {
                        return;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);
        b.levelorder(root);

    }
}
