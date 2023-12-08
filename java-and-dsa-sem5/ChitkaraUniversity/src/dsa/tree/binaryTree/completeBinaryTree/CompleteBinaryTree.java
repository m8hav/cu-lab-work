package dsa.tree.binaryTree.completeBinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class CompleteBinaryTree {

    private Node root;

    public CompleteBinaryTree() {
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
        // ADDING IN LEVEL ORDER

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(currentRoot);

        Node currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.poll();

            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new Node(value));
                break;
            }
            queue.add(currentNode.getLeft());

            if (currentNode.getRight() == null) {
                currentNode.setRight(new Node(value));
                break;
            }
            queue.add(currentNode.getRight());
        }

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
        System.out.println(node.getValue());
        _showTreeWithLevels(node.getLeft(), level + 1);
        _showTreeWithLevels(node.getRight(), level + 1);
    }

    // Depth-First Search
    public void traverseInOrder() {
        traverseInOrder(root);
        System.out.println();
    }

    public void traverseInOrder(Node currentRoot) {
        if (currentRoot == null) return;
        traverseInOrder(currentRoot.getLeft());
        System.out.print(currentRoot.getValue() + " ");
        traverseInOrder(currentRoot.getRight());
    }

    public void traversePreOrder() {
        traversePreOrder(root);
        System.out.println();
    }

    public void traversePreOrder(Node currentRoot) {
        if (currentRoot == null) return;
        System.out.print(currentRoot.getValue() + " ");
        traverseInOrder(currentRoot.getLeft());
        traverseInOrder(currentRoot.getRight());
    }

    public void traversePostOrder() {
        traversePostOrder(root);
        System.out.println();
    }

    public void traversePostOrder(Node currentRoot) {
        if (currentRoot == null) return;
        traverseInOrder(currentRoot.getLeft());
        traverseInOrder(currentRoot.getRight());
        System.out.print(currentRoot.getValue() + " ");
    }

    public int getTotalNodes() {
        return countNodes(root);
    }

    private int countNodes(Node currentRoot) {
        if (currentRoot == null) return 0;
        // recursively counting nodes in getLeft() and getRight() subtrees
        return 1 + countNodes(currentRoot.getLeft()) + countNodes(currentRoot.getRight());
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
        return 1 + Math.max(treeHeight(currentRoot.getLeft()), treeHeight(currentRoot.getRight()));
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
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
        }
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(Node currentRoot, int value) {
        if (currentRoot == null) return false;
        if (root.getValue() == value) return true;
        return searchNode(currentRoot.getLeft(), value) || searchNode(currentRoot.getRight(), value);
    }

    public int getLeafNodes() {
        System.out.println("Leaf nodes:");
        int count = countLeafNodes(root);
        System.out.println();
        return count;
    }

    private int countLeafNodes(Node currentRoot) {
        if (currentRoot == null) return 0;
        if (currentRoot.getLeft() == null && currentRoot.getRight() == null) {
            System.out.print(currentRoot.getValue() + " ");
            return 1;
        }
        return countLeafNodes(currentRoot.getLeft()) + countLeafNodes(currentRoot.getRight());
    }
}
