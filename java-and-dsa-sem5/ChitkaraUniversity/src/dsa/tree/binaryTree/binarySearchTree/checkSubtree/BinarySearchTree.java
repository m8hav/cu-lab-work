package dsa.tree.binaryTree.binarySearchTree.checkSubtree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
Use any kind of traversal, just not level order traversal.
 */

class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void addAll(int[] values) {
        for (int value : values) {
            add(value);
        }
    }

    public void add(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node currentRoot, int value) {
        // Case 1: When root is null
        if (currentRoot == null) {
            return new Node(value);
        }

        // Case 2: When root is not null
        if (value < currentRoot.getValue())
            currentRoot.setLeft(addNode(currentRoot.getLeft(), value));
        else
            currentRoot.setRight(addNode(currentRoot.getRight(), value));

        return currentRoot;
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

    public List<Integer> preOrderTraversal() {
        List<Integer> list = new ArrayList<>();
        preOrderTraversal(root, list);
        return list;
    }

    private void preOrderTraversal(Node currentRoot, List<Integer> list) {
        if (currentRoot == null) {
            list.add(null);
            return;
        }
        list.add(currentRoot.getValue());
        preOrderTraversal(currentRoot.getLeft(), list);
        preOrderTraversal(currentRoot.getRight(), list);
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(Node currentRoot, int value) {
        if (currentRoot == null) return false;

        if (currentRoot.getValue() == value) return true;

        if (value < currentRoot.getValue())
            return searchNode(currentRoot.getLeft(), value);

        return searchNode(currentRoot.getRight(), value);
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node currentRoot, int value) {
        if (currentRoot == null) return null;

        if (value < currentRoot.getValue()) {
            currentRoot.setLeft(deleteNode(currentRoot.getLeft(), value));
        } else if (value > currentRoot.getValue()) {
            currentRoot.setRight(deleteNode(currentRoot.getRight(), value));
        } else {
            // Case 1: When node has no child
            if (currentRoot.getLeft() == null && currentRoot.getRight() == null) {
                return null;
            }

            // Case 2: When node has one child
            if (currentRoot.getLeft() == null) {
                return currentRoot.getRight();
            }

            if (currentRoot.getRight() == null) {
                return currentRoot.getLeft();
            }

            // Case 3: When node has two children
            int minValue = findMinValue(currentRoot.getRight());
            currentRoot.setValue(minValue);
            currentRoot.setRight(deleteNode(currentRoot.getRight(), minValue));
        }

        return currentRoot;
    }

    private int findMinValue(Node currentRoot) {
        return currentRoot.getLeft() == null ? currentRoot.getValue() : findMinValue(currentRoot.getLeft());
    }

    public String toStringSeparatedByComma() {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = this.preOrderTraversal();
        for (Integer i : list) {
            sb.append(i);
            sb.append(", ");
        }
        return sb.toString();
    }

    public boolean containsSubtree(BinarySearchTree t2) {
        return this.toStringSeparatedByComma()
                .contains(t2.toStringSeparatedByComma());
    }

    public boolean isSameTree(BinarySearchTree t2) {
        return this.toStringSeparatedByComma()
                .equals(t2.toStringSeparatedByComma());
    }

    public static void main(String[] args) {
        int[] values1 = {6, 4, 8, 3, 5, 7, 9};
        int[] values2 = {4, 3, 5};
        int[] values3 = {3, 4, 5};
        int[] values4 = {6, 8, 4, 5, 3, 9, 7};
        int[] values5 = {4, 3, 5, 7, 9};


        BinarySearchTree t1 = new BinarySearchTree();
        t1.addAll(values1);
        BinarySearchTree t2 = new BinarySearchTree();
        t2.addAll(values2);
        BinarySearchTree t3 = new BinarySearchTree();
        t3.addAll(values3);
        BinarySearchTree t4 = new BinarySearchTree();
        t4.addAll(values4);
        BinarySearchTree t5 = new BinarySearchTree();
        t5.addAll(values5);

        System.out.println("Binary Trees Pre-Order Traversals:");
        System.out.println("T1: " + t1.toStringSeparatedByComma());
        System.out.println("T2: " + t2.toStringSeparatedByComma());
        System.out.println("T3: " + t3.toStringSeparatedByComma());
        System.out.println("T4: " + t4.toStringSeparatedByComma());
        System.out.println("T5: " + t5.toStringSeparatedByComma());
        System.out.println();

        System.out.println("T1 contains subtree:");
        System.out.println("T2: " + t1.containsSubtree(t2));
        System.out.println("T3: " + t1.containsSubtree(t3));
        System.out.println("T4: " + t1.containsSubtree(t4));
        System.out.println("T5: " + t1.containsSubtree(t5));
        System.out.println();

        System.out.println("T1 is same tree as:");
        System.out.println("T2: " + t1.isSameTree(t2));
        System.out.println("T3: " + t1.isSameTree(t3));
        System.out.println("T4: " + t1.isSameTree(t4));
        System.out.println("T5: " + t1.isSameTree(t5));

    }
}
