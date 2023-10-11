package dsa.linkedList.singly;

public class DetectLoopInLL {
    static class Node {
        int data;
        Node next;

        public Node (int x) {
            data = x;
            next = null;
        }
    }
    Node head;

    public void createLoopedLinkedList(int size, int[] values, int loopToPosition) {
        Node firstNode = null;
        for (int val : values) {
            if (head == null) {
                head = new Node(val);
                firstNode = head;
                continue;
            }
            Node newNode = new Node(val);
            head.next = newNode;
            head = newNode;
        }
        Node loopToNode = head;
        for (int i = 1; i < loopToPosition; i++)
            loopToNode = loopToNode.next;
        firstNode.next = loopToNode;
    }
    public boolean isCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        DetectLoopInLL obj = new DetectLoopInLL();
        obj.createLoopedLinkedList(6, new int[]{1, 2, 3, 4, 5, 6}, 2);
        System.out.println(obj.isCycle(obj.getHead()));
    }
}
