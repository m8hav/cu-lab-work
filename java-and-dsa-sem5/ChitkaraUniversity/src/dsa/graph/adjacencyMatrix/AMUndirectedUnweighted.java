package dsa.graph.adjacencyMatrix;

/*

Undirected and Unweighted Graph

 */

public class AMUndirectedUnweighted {

    private final int[][] adjacencyMatrix;

    public AMUndirectedUnweighted(int nodes) {
        adjacencyMatrix = new int[nodes][nodes];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        // If undirected graph, add this line below to make it bidirectional
        adjacencyMatrix[destination][source] = 1;
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
        // If undirected graph, add this line below to make it bidirectional
        adjacencyMatrix[destination][source] = 0;
    }

    public void printMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int[] matrix : adjacencyMatrix) {
            for (int j = 0; j < adjacencyMatrix.length; j++)
                System.out.print(matrix[j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AMUndirectedUnweighted graph1 = new AMUndirectedUnweighted(4);
        graph1.addEdge(0, 1);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 0);
        graph1.printMatrix();

        AMUndirectedUnweighted graph2 = new AMUndirectedUnweighted(6);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(1, 3);
        graph2.addEdge(2, 4);
        graph2.addEdge(3, 4);
        graph2.addEdge(3, 5);
        graph2.printMatrix();

    }
}
