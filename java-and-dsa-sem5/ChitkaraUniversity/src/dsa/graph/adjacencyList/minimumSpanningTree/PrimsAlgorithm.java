package dsa.graph.adjacencyList.minimumSpanningTree;

import java.util.*;

/*

Minimum Spanning Tree

Use Prim's Algorithm:
- uses greedy approach
- works for both directed and undirected graph
- uses priority queue
[ use priority queue to get the minimum weight edge ]
[ use priority queue in a problem whenever you have to get the minimum or maximum value in a given set of values ]

A spanning tree of a graph is a tree that contains all the vertices of the graph.

A minimum spanning tree (MST) or minimum weight spanning tree for a weighted, connected and undirected graph is a spanning tree with weight less than or equal to the weight of every other spanning tree.

The weight of a spanning tree is the sum of weights given to each edge of the spanning tree.

A minimum spanning tree has (V – 1) edges where V is the number of vertices in the given graph.

Example:

Input:
Vertices = 5
Edges = 8
Connect Edges (Source Destination Weight):
0 1 6
0 3 4
1 2 10
1 3 7
1 4 7
2 4 5
2 3 8
3 4 12

Output:
Minimum Spanning Tree Edges:
0 - 3
0 - 1
1 - 4
4 - 2



 */

public class PrimsAlgorithm {

    static class Node {
        final int destination;
        final int weight;

        public Node(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Edge {
        final int source;
        final int destination;
        final int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private final int V;
    private final List<List<Node>> adjacencyList;

    public PrimsAlgorithm(int V) {
        this.V = V;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adjacencyList.add(new ArrayList<>());
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Node(destination, weight));
        // for undirected graph
        adjacencyList.get(destination).add(new Node(source, weight));
    }

    public List<Edge> doFindMinimumSpanningTree(int startVertex) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(V, Comparator.comparingInt(e -> e.weight));
        // or
        // PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(V, (a, b) -> a.weight - b.weight);
        List<Edge> mstEdges = new ArrayList<>();

        // Add the starting vertex to the MST
        visited[startVertex] = true;

        // Add all edges from this vertex to the priority queue
        for (Node neighbor : adjacencyList.get(startVertex)) {
            priorityQueue.add(new Edge(startVertex, neighbor.destination, neighbor.weight));
        }

        while (!priorityQueue.isEmpty()) {
            Edge edge = priorityQueue.poll();

            // Skip if the vertex is already in the MST
            if (visited[edge.destination]) continue;

            // Add the vertex to the MST
            visited[edge.destination] = true;
            mstEdges.add(edge);

            // Add all edges from this vertex to the priority queue
            for (Node neighbor : adjacencyList.get(edge.destination)) {
                if (!visited[neighbor.destination]) {
                    priorityQueue.add(new Edge(edge.destination, neighbor.destination, neighbor.weight));
                }
            }
        }

        return mstEdges;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vertices: ");
        int vertices = scanner.nextInt();
        PrimsAlgorithm graph = new PrimsAlgorithm(vertices);

        System.out.print("Edges: ");
        int edges = scanner.nextInt();

        System.out.println("Connect Edges (Source Destination Weight): ");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(source, destination, weight);
        }

        List<PrimsAlgorithm.Edge> mstEdges = graph.doFindMinimumSpanningTree(0);

        System.out.println("Minimum Spanning Tree Edges: ");
        for (PrimsAlgorithm.Edge edge : mstEdges) {
            System.out.println(edge.source + " - " + edge.destination);
        }

    }
}

/*

Vertices = 5
Edges = 8
Connect Edges (Source Destination Weight):
0 1 6
0 3 4
1 2 10
1 3 7
1 4 7
2 4 5
2 3 8
3 4 12
Minimum Spanning Tree Edges:
0 - 3
0 - 1
1 - 4
4 - 2

 */