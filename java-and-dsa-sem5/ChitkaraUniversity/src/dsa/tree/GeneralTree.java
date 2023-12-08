package dsa.tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    private int data;
    private final List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public List<TreeNode> getChildren() {
        return children;
    }
}

public class GeneralTree {

    private final TreeNode root;

    public GeneralTree(int data) {
        this.root = new TreeNode(data);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void displayTree() {
        displayTree(root, 0);
    }

    // going depth first even though it can't exactly be called DFS
    // because DFS and BFS terminology is only used with Binary trees
    // where the data may be ordered among
    public void displayTree(TreeNode node, int level) {
        for (int i = 0; i < level; i++) {
            // adding tabs to represent levels
            System.out.print("\t");
        }

        System.out.println("- " + node.getData());

        List<TreeNode> children = node.getChildren();
        for (TreeNode child : children) {
            // recursive call for each child
            displayTree(child, level + 1);
        }
    }

    // other methods to manipulate the tree can be added here
    // For example: addNode, removeNode, traverse, etc.

    public static void main(String[] args) {
        GeneralTree myTree = new GeneralTree(0);

        TreeNode nodeA = new TreeNode(1);
        TreeNode nodeB = new TreeNode(2);
        TreeNode nodeC = new TreeNode(3);
        TreeNode nodeD = new TreeNode(4);
        TreeNode nodeE = new TreeNode(5);
        TreeNode nodeF = new TreeNode(6);

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeC);
        nodeB.addChild(nodeD);
        nodeB.addChild(nodeE);

        myTree.getRoot().addChild(nodeA);
        myTree.getRoot().addChild(nodeF);

        TreeNode root = myTree.getRoot();
        System.out.println("Root Node Data: " + root.getData());

        List<TreeNode> childrenOfRoot = root.getChildren();
        for (TreeNode child : childrenOfRoot) {
            System.out.println("Child Node Data: " + child.getData());
        }

        myTree.displayTree();

    }
}
