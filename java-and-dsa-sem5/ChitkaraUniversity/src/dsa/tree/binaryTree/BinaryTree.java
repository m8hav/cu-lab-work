package dsa.tree.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
    static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    // this doesn't make a complete binary tree
    // it makes a one-sided branched binary tree
    public void add(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node currentRoot, int value) {
        // Case 1: When root is null
        if (currentRoot == null)
            return new Node(value);

        // Case 2: When currentRoot is not null
        if (currentRoot.left == null)
            currentRoot.left = new Node(value);
        else if (currentRoot.right == null)
            currentRoot.right = new Node(value);
        else currentRoot.left = addNode(currentRoot.left, value);

        return currentRoot;
    }

    // my implementation of showing tree data
    public void showTreeWithLevels() {
        _showTreeWithLevels(root, 0);
    }

    private void _showTreeWithLevels(Node node, int level) {
        if (node == null) return;
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(node.value);
        _showTreeWithLevels(node.left, level + 1);
        _showTreeWithLevels(node.right, level + 1);
    }

    // Depth-First Search
    public void traverseInOrder() {
        traverseInOrder(root);
        System.out.println();
    }

    public void traverseInOrder(Node currentRoot) {
        if (currentRoot == null) return;
        traverseInOrder(currentRoot.left);
        System.out.print(currentRoot.value + " ");
        traverseInOrder(currentRoot.right);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
        System.out.println();
    }

    public void traversePreOrder(Node currentRoot) {
        if (currentRoot == null) return;
        System.out.print(currentRoot.value + " ");
        traverseInOrder(currentRoot.left);
        traverseInOrder(currentRoot.right);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
        System.out.println();
    }

    public void traversePostOrder(Node currentRoot) {
        if (currentRoot == null) return;
        traverseInOrder(currentRoot.left);
        traverseInOrder(currentRoot.right);
        System.out.print(currentRoot.value + " ");
    }

    public int getTotalNodes() {
        return countNodes(root);
    }

    private int countNodes(Node currentRoot) {
        if (currentRoot == null) return 0;
        // recursively counting nodes in left and right subtrees
        return 1 + countNodes(currentRoot.left) + countNodes(currentRoot.right);
    }

    public int getTreeHeight() {
        return treeHeight(root);
    }

    private int treeHeight(Node currentRoot) {
        if (currentRoot == null)
            // height is -1 for an empty tree
            // height is 0 for a tree with one node
            return -1;

        // returning max height between both subtrees
        return 1 + Math.max(treeHeight(currentRoot.left), treeHeight(currentRoot.right));
    }

    public void levelOrderTraversal() {
        levelOrderTraversal(root);
        System.out.println();
    }

    private void levelOrderTraversal(Node currentRoot) {
        if (currentRoot == null) return;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(currentRoot);

        Node node;
        while (!queue.isEmpty()) {
            node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.add(7);
        bt.add(8);
        bt.add(9);
        bt.add(10);

        System.out.println("Total Nodes: " + bt.getTotalNodes());
        System.out.println("Height: " + bt.getTreeHeight());
        System.out.println();

        System.out.println("In-Order Traversal:");
        bt.traverseInOrder();
        System.out.println();

        System.out.println("Pre-Order Traversal:");
        bt.traversePreOrder();
        System.out.println();

        System.out.println("Post-Order Traversal:");
        bt.traversePostOrder();
        System.out.println();

        System.out.println("Level Order Traversal:");
        bt.levelOrderTraversal();
        System.out.println();

        System.out.println("My level representation:");
        bt.showTreeWithLevels();

    }
}
