package Recursion.TimePassQuestion;

public class HeightOfBinaryTree {

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to calculate height
    public int height(Node root) {
        if (root == null) {
            return -1; // return 0 if you want height in terms of nodes
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Main method
    public static void main(String[] args) {

        HeightOfBinaryTree tree = new HeightOfBinaryTree();

        // Creating tree
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        int h = tree.height(root);

        System.out.println("Height of Binary Tree: " + h);
    }
}