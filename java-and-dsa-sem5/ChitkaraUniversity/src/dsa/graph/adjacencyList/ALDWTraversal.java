package dsa.graph.adjacencyList;

/*

Adjacency List Directed Weighted Graph Traversal

NOT COMPLETE YET

 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ALDWTraversal {

    private final ArrayList<ArrayList<Integer[]>> adjacencyList;

    public ALDWTraversal(int nodes) {
        adjacencyList = new ArrayList<ArrayList<Integer[]>>();
        for (int i = 0; i < nodes; i++) {
            adjacencyList.add(new ArrayList<Integer[]>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Integer[]{destination, weight});
    }

    public void removeEdge(int source, int destination) {
        // removing destination element from source's list
        for (int i = 0; i < adjacencyList.get(source).size(); i++) {
            if (adjacencyList.get(source).get(i)[0] == destination) {
                adjacencyList.get(source).remove(i);
                break;
            }
        }
    }

    public void printGraph() {
        System.out.println("Adjacency List:");
//        for (int i = 0; i < adjacencyList.size(); i++) {
//            System.out.print("Vertex " + i + " is connected to: ");
//            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
//                System.out.print(adjacencyList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
        // Sir's code
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print(i);
            for (int j = 0; j < adjacencyList.get(i).size(); j++) {
                System.out.print((j == 0 ? " -> " : ", ") + String.format("(%d - %d)", adjacencyList.get(i).get(j)[0], adjacencyList.get(i).get(j)[1]));
            }
            System.out.println();
        }
    }

    public void doDepthFirstTraversal(int startingNode, boolean[] visited) {
        System.out.println("Depth First Traversal");

        Stack<Integer> stack = new Stack<>();

        stack.push(startingNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited[currentNode]) {
                visited[currentNode] = true;
                System.out.print(currentNode + " ");

                for (int i = 0; i < adjacencyList.get(currentNode).size(); i++) {
                    int neighborName = adjacencyList.get(currentNode).get(i)[0];
                    int neighborWeight = adjacencyList.get(currentNode).get(i)[1];

                    if (!visited[neighborName]) stack.push(neighborName);
                }
            }
        }
    }

    public void doBreadthFirstTraversal(int startingNode, boolean[] visited) {
        System.out.println("Breadth First Traversal");

        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(startingNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            for (int i = 0; i < adjacencyList.get(currentNode).size(); i++) {
                int neighborName = adjacencyList.get(currentNode).get(i)[0];
                int neighborWeight = adjacencyList.get(currentNode).get(i)[1];

                if (!visited[neighborName]) queue.add(neighborName);
            }
        }
    }

    public static void main(String[] args) {
        ALDWTraversal graph1 = new ALDWTraversal(4);
        graph1.addEdge(0, 1, 5);
        graph1.addEdge(1, 2, 6);
        graph1.addEdge(2, 3, 7);
        graph1.addEdge(3,0, 8);
        graph1.printGraph();
        boolean visited1[] = new boolean[4];
        graph1.doDepthFirstTraversal(0, visited1);

        ALDWTraversal graph2 = new ALDWTraversal(6);
        graph2.addEdge(0, 1, 5);
        graph2.addEdge(1, 2, 5);
        graph2.addEdge(1, 3, 5);
        graph2.addEdge(2, 4, 5);
        graph2.addEdge(3, 4, 5);
        graph2.addEdge(3, 5, 5);
        graph2.printGraph();
        boolean visited2[] = new boolean[6];
        graph1.doDepthFirstTraversal(0, visited2);
    }
}
