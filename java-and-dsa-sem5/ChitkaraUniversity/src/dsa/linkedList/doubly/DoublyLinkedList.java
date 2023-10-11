package dsa.linkedList.doubly;

import java.util.Scanner;

public class DoublyLinkedList {

    Node tail;
    Node head;

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public void displayReverse() {
        Node curr = tail;
        while (curr != null) {
            System.out.println(curr.prev);
            curr = curr.prev;
        }
    }

    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtPosition(int position, int value) {
        Node newNode = new Node(value);
        Node curr = head;
        for (int curr_pos = 1; curr_pos < position && curr.next != null; curr_pos++)
            curr = curr.next;

//        insert at position 3 i.e. index 2
//        0 0 0 0 0
//        0 1 2 3 4

        (curr.next).prev = newNode;
        newNode.prev = curr;
        newNode.next = curr.next;
        curr.next = newNode;
        newNode.next = curr.next;

        newNode.prev = curr;
        curr.next = newNode;
        if (curr.next == null) {
            tail = newNode;
        } else {
            newNode.next = curr.next;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }
        Node curr = head;
        for (int i = 0; i < position && curr != null; i++) curr = curr.next;
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
//        Node testNode = new Node(10);
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(19);

        dll.display();
    }
}
