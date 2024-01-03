package dsa.tree.binaryTree.binarySearchTree.views;

import java.util.ArrayDeque;
import java.util.Queue;

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



    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(10);
        bst.add(15);
        bst.add(1);
        bst.add(20);
        bst.add(25);
        bst.add(5);
        bst.add(7);
        bst.add(12);
        bst.add(-4);
        bst.add(18);
        bst.add(6);

        /*
                    10
              1            15
          -4     5     12     20
                   7        18    25
                 6
         */

        bst.levelOrderTraversal();

    }
}
