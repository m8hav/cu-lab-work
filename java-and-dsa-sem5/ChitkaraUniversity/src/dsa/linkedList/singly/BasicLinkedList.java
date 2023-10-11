package dsa.linkedList.singly;

import java.util.stream.IntStream;

public class BasicLinkedList {
    static class Node {
        int data;
        Node next;

        public Node (int x) {
            data = x;
            next = null;
        }
    }

    Node head;
    public BasicLinkedList() {
        head = null;
    }

//    Add a node
    public Node insertAtHead(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public Node insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if (head == null) {
            head = newNode;
            return head;
        }

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

        return newNode;
    }

//    Show the linked list
    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

//    Delete the first node
    public Node deleteAtHead() {
        if (head == null) return null;

        Node deletedNode = head;
        head = head.next;

//        making last node's next null too for security issues
//        i.e. no node of linked list should be accessible by a deleted node
//        in case somebody accesses it before it gets deleted by garbage collector
//        then it shouldn't point to the head
        deletedNode.next = null;

        return deletedNode;
    }

    public int search(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        BasicLinkedList obj = new BasicLinkedList();

//        IntStream.range(10, 16).forEach(i -> obj.insert(i));
//        same as above
        IntStream.range(11, 16).forEach(obj::insertAtHead);

        obj.show();

        System.out.println(obj.deleteAtHead());

        obj.show();

        System.out.println(obj.search(211));
        System.out.println(obj.search(11));

    }
}
