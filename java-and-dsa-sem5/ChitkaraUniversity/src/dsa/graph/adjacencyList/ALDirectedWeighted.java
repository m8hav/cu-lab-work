package dsa.graph.adjacencyList;

import dsa.graph.adjacencyMatrix.AMDirectedWeighted;

import java.util.ArrayList;
import java.util.Arrays;

public class ALDirectedWeighted {

    private final ArrayList<ArrayList<Integer[]>> adjacencyList;

    public ALDirectedWeighted(int nodes) {
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

    public static void main(String[] args) {
        ALDirectedWeighted graph = new ALDirectedWeighted(4);
        graph.addEdge(0, 1, 5);
        graph.addEdge(1, 2, 6);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3,0, 8);
        graph.printGraph();

        ALDirectedWeighted graph2 = new ALDirectedWeighted(6);
        graph2.addEdge(0, 1, 5);
        graph2.addEdge(1, 2, 5);
        graph2.addEdge(1, 3, 5);
        graph2.addEdge(2, 4, 5);
        graph2.addEdge(3, 4, 5);
        graph2.addEdge(3, 5, 5);
        graph2.printGraph();
    }
}
