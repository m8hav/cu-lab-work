package dsa.tree.binaryTree.completeBinaryTree;

import java.util.Scanner;

public class Main {
    static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(input.nextLine().trim());

        CompleteBinaryTree bt = new CompleteBinaryTree();

        int val;
        for (int i = 0; i < n; i++) {
            val = input.nextInt();
            bt.add(val);
        }

        System.out.println("Pre-Order Traversal:");
        bt.traversePreOrder();

        System.out.println("In-Order Traversal:");
        bt.traverseInOrder();

        System.out.println("Post-Order Traversal:");
        bt.traversePostOrder();

        System.out.println("Level-Order Traversal:");
        bt.levelOrderTraversal();

        int numberOfLeafNodes = bt.getLeafNodes();
        System.out.println("Number of leaf nodes:");
        System.out.println(numberOfLeafNodes);

        System.out.println("Showing tree with levels:");
        bt.showTreeWithLevels();
    }
}
