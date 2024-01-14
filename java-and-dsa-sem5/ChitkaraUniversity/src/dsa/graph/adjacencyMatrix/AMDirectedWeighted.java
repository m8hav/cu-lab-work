package dsa.graph.adjacencyMatrix;

/*

Directed and Weighted Graph

 */

public class AMDirectedWeighted {

    private final int[][] adjacencyMatrix;

    public AMDirectedWeighted(int nodes) {
        adjacencyMatrix = new int[nodes][nodes];
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
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
        AMDirectedWeighted graph1 = new AMDirectedWeighted(4);
        graph1.addEdge(0, 1, 2);
        graph1.addEdge(1, 2, 3);
        graph1.addEdge(2, 3, 4);
        graph1.addEdge(3, 0, 5);
        graph1.printMatrix();

        AMDirectedWeighted graph2 = new AMDirectedWeighted(6);
        graph2.addEdge(0, 1, 5);
        graph2.addEdge(1, 2, 5);
        graph2.addEdge(1, 3, 5);
        graph2.addEdge(2, 4, 5);
        graph2.addEdge(3, 4, 5);
        graph2.addEdge(3, 5, 5);
        graph2.printMatrix();


    }
}
