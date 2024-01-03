package dsa.tree.binaryTree.balancedTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Tree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public void add(int[] values) {
        for (int value : values) add(value);
    }

    public void add(List<Integer> values) {
        for (int value : values) add(value);
    }

    public void add(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node currentRoot, int value) {
        if (currentRoot == null) return new Node(value);

//        Queue<Node> queue = new ArrayDeque<>();
//        queue.add(root);
//        Node currentNode;
//
//        while (!queue.isEmpty()) {
//            currentNode = queue.poll();
//
//            if (currentNode.left == null) {
//                currentNode.left = new Node(value);
//                break;
//            }
//            queue.add(currentNode.left);
//
//            if (currentNode.right == null) {
//                currentNode.right = new Node(value);
//                break;
//            }
//            queue.add(currentNode.right);
//        }

        if (value < currentRoot.value) currentRoot.left = addNode(currentRoot.left, value);
        else currentRoot.right = addNode(currentRoot.right, value);

        return root;
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node currentRoot) {
        if (currentRoot == null) return 0;

        return Math.max(1 + getHeight(currentRoot.left), 1 + getHeight(currentRoot.right));
    }

    private void clear() {
        root = null;
    }

    public List<Integer> getInOrderTraversalValues() {
        List<Integer> values = new ArrayList<>();
        getInOrderTraversalValues(root, values);
        return values;
    }

    public void getInOrderTraversalValues(Node currentRoot, List<Integer> values) {
        if (currentRoot == null) return;
        getInOrderTraversalValues(currentRoot.left, values);
        values.add(currentRoot.value);
        getInOrderTraversalValues(currentRoot.right, values);
    }

    public List<Integer> getPreOrderTraversalValues() {
        List<Integer> values = new ArrayList<>();
        getPreOrderTraversalValues(root, values);
        return values;
    }

    public void getPreOrderTraversalValues(Node currentRoot, List<Integer> values) {
        if (currentRoot == null) return;
        values.add(currentRoot.value);
        getPreOrderTraversalValues(currentRoot.left, values);
        getPreOrderTraversalValues(currentRoot.right, values);
    }

    public List<Integer> getPostOrderTraversalValues() {
        List<Integer> values = new ArrayList<>();
        getPostOrderTraversalValues(root, values);
        return values;
    }

    public void getPostOrderTraversalValues(Node currentRoot, List<Integer> values) {
        if (currentRoot == null) return;
        getPostOrderTraversalValues(currentRoot.left, values);
        getPostOrderTraversalValues(currentRoot.right, values);
        values.add(currentRoot.value);
    }

    private void convertToMinHeightTree() {
        Tree preOrderTree = new Tree();
        preOrderTree.add(getPreOrderTraversalValues());
        int preOrderTreeHeight = preOrderTree.getHeight();

        Tree inOrderTree = new Tree();
        inOrderTree.add(getInOrderTraversalValues());
        int inOrderTreeHeight = inOrderTree.getHeight();

        Tree postOrderTree = new Tree();
        postOrderTree.add(getPostOrderTraversalValues());
        int postOrderTreeHeight = postOrderTree.getHeight();

        int minHeight = Math.min(Math.min(preOrderTreeHeight, inOrderTreeHeight), postOrderTreeHeight);

        if (minHeight == preOrderTreeHeight) {
            clear();
            add(preOrderTree.getInOrderTraversalValues());
        } else if (minHeight == inOrderTreeHeight) {
            clear();
            add(inOrderTree.getInOrderTraversalValues());
        } else {
            clear();
            add(postOrderTree.getInOrderTraversalValues());
        }
    }

    public static void main(String[] args) {

    }
}
