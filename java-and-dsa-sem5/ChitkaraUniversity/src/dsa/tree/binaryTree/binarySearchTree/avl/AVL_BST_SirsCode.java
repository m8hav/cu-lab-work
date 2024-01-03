package com.java.algo.tree.bst.balanced.avl;

import java.util.Scanner;


class Node {
    
	int value; 
    int height;
    Node left; 
    Node right;

    Node(int value) {
        this.value = value;
        this.height = 1;
    }
    
}



class Tree {

    private Node root;

    //private static Scanner input;
    //private int N;
    
    /*
    static {
    	input = new Scanner(System.in);
    }
    
    public Tree(int N) {
    	N = input.nextInt();
    	
    	this.root = null;
    	this.N = N;
    	
    }
    */
    
    public void getLine() {
    	System.out.println("");
    }
    
    // Get the height of the node
    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    // Get the maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Right rotate subtree rooted with y
    Node rightRotate(Node y) {
    	
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // Left rotate subtree rooted with x
    Node leftRotate(Node x) {
    	
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    
    
    
    
    
    
    
    // Get balance factor of a node
    int getBalance(Node N) {
        if (N == null)
            return 0;
        
        //System.out.println("L: " +  height(N.left) + " - " + "R: " +  height(N.right));
        return height(N.left) - height(N.right);
    }

    
    
    
    
    
    
    
    
    
    
    /*
     * ADD as in BST
     */
    
    //Node add(<root-node>, <new-node-value>) {
    Node add(Node node, int value) {
    	
    	System.out.println("Adding... " + value);
    	
    	if (node == null)
            return (new Node(value));
        if (value < node.value)
            node.left = add(node.left, value);
        else if (value > node.value)
            node.right = add(node.right, value);
        else 
            return node;	// Duplicate values are not allowed in AVL trees
        
        
        
        
        
        
        System.out.println("\n--------- " + node.value + " is ADDED.\n");
        
        
        /*
         * Self-Balanced AVL Tree Implementation 
         */
        
        
        
        /*
         * STEP 1: Update height of this ancestor node 
         */
        node.height = 1 + max(height(node.left), height(node.right));
        //System.out.println("node.height: " + node.height);

        
        
        
        
        
        
        /*
         * STEP 2: Get the balance factor of this ancestor node
         */
        int balance = getBalance(node);
        System.out.println("balance: " + balance);        
        
        
        
        
        
        
        
        
        /*
         * STEP 3: 4 Cases - If the node becomes unbalanced
         */
/* 
        System.out.println("node.value: " + node.value);
        System.out.println("value: " + value);
        if(node.left != null) {
        	System.out.println("node.left.value: " + node.left.value);
        }
        if(node.right != null) {
        	System.out.println("node.right.value: " + node.right.value);
        }
*/        

        
  /*      
  BALANCE > +1
  BALANCE < -1
  */      
        
        
        // Left Left Case
        if (balance > 1 && value < node.left.value) {
            //System.out.println("Left Left Case");
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && value > node.right.value) {
            //System.out.println("Right Right Case");
            return leftRotate(node);
        }

        // Left Right Case
        if (balance > 1 && value > node.left.value) {
            //System.out.println("Left Right Case");
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && value < node.right.value) {
            //System.out.println("Right Left Case");
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        // return the (unchanged) node pointer
        return node;
    
    
    }

    
    
    
    // A utility function to print preorder traversal
    // of the tree.
    // The function also prints height of every node
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    
    
    /*
     * To Delete
     */
    
    Node deleteNode(Node root, int value) {
        if (root == null)
            return root;

        // Perform standard BST delete
        if (value < root.value)
            root.left = deleteNode(root.left, value);
        else if (value > root.value)
            root.right = deleteNode(root.right, value);
        else {
            // Node with only one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                // No child case
                if (temp == null) {
                    temp = root;
                    root = null;
                } else // One child case
                    root = temp; // Copy the contents of the non-empty child

            } else {
                // Node with two children: Get the inorder successor
                Node temp = minValueNode(root.right);

                // Copy the inorder successor's data to this node
                root.value = temp.value;

                // Delete the inorder successor
                root.right = deleteNode(root.right, temp.value);
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // Update the height of the current node
        root.height = max(height(root.left), height(root.right)) + 1;

        // Get the balance factor of this node
        int balance = getBalance(root);

        // Balance the tree if needed

        // Left Left Case
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    
    
    
    
    
    // Get the node with the minimum key value found in a given tree
    Node minValueNode(Node node) {
        Node current = node;

        while (current.left != null)
            current = current.left;

        return current;
    }
    
    
    
    
    //DRIVER CODE
    public static void main(String[] args) {

    	/*
    	int N = 0;
    	Tree t = new Tree(N);
		*/
    	
    	Tree t = new Tree();
    	
		t.root = t.add(t.root, 10);
        t.root = t.add(t.root, 20);
        t.root = t.add(t.root, 30);
        t.root = t.add(t.root, 40);
        t.root = t.add(t.root, 50);
        t.root = t.add(t.root, 25);

        /* The constructed AVL Tree would be
             30
            /  \
           20   40
          / \    \
        10  25   50
        */

        
        
        
        t.getLine();
        
        System.out.print(">> Traversal - PREORDER: After Addition: ");
        t.preOrder(t.root);
        
        t.getLine();
        
        t.root = t.deleteNode(t.root, 40);
        System.out.print(">> Traversal - PREORDER: After Deletion: ");
        t.preOrder(t.root);
        
        
    }
}
