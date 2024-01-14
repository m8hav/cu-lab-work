package dsa.graph.adjacencyList;

import java.util.ArrayList;

public class ALUndirectedUnweighted {

    private final ArrayList<ArrayList<Integer>> adjacencyList;

    public ALUndirectedUnweighted(int nodes) {
        adjacencyList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nodes; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public void removeEdge(int source, int destination) {
        // removing destination element from source's list
        for (int i = 0; i < adjacencyList.get(source).size(); i++) {
            if (adjacencyList.get(source).get(i) == destination) {
                adjacencyList.get(source).remove(i);
                break;
            }
        }
        // removing source element from destination's list
        for (int i = 0; i < adjacencyList.get(destination).size(); i++) {
            if (adjacencyList.get(destination).get(i) == source) {
                adjacencyList.get(destination).remove(i);
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
                System.out.print((j == 0 ? " -> " : ", ") + adjacencyList.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ALUndirectedUnweighted graph = new ALUndirectedUnweighted(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3,0);
        graph.printGraph();
    }
}
