public class _9_sortedArrayBST {

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

    public static Node creatBST(int[] arr, int s, int e) {
        if (s > e) {
            return null;
        }
        int mid = (s + e) / 2;

        Node root = new Node(arr[mid]);

        root.left = creatBST(arr, s, mid - 1);
        root.right = creatBST(arr, mid + 1, e);
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {

        int values[] = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = creatBST(values, 0, values.length - 1);

        preOrder(root);

    }
}
