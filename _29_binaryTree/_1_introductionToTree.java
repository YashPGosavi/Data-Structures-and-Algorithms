/*

Tree :-
Hirarchical data structure

*/ 
public class _1_introductionToTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
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
    }

    public static void main(String[] args) {

        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(node);
        System.out.println(root.data);

    }
    
}
