package practice;

//class Node2 {
//    int data;
//    Node2 next;
//
//    public Node2(){ }
//}

public class NodeTest {

//    class has to be outside this class, or nested static to be used in static main method
    static class Node2 {
        int data;
        Node2 next;

        public Node2(){ }
    }

    Node2 Delete(Node2 head, int position) {
        // Complete this method
        int index = 0;
        Node2 current = head;
        if (position == 0 ){
            head = head.next;
        }
        else{
            while (index < (position - 1)){
                current = current.next;
            }
            current.next = current.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node2 head = new Node2();
        head.data = 0;

        Node2 node1 = new Node2();
        node1.data = 1;

        Node2 node2 = new Node2();
        node2.data = 2;

        head.next = node1;
        node1.next = node2;
    }
}