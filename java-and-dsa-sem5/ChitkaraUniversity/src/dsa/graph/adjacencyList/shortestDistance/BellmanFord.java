package dsa.graph.adjacencyList.shortestDistance;

import java.util.*;

public class BellmanFord {

    static class Edge {
        public int source;
        public int destination;
        public int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static final int INFINITY = Integer.MAX_VALUE;
    private List<Edge> edges;
    private int vertices;       // nodes

    public BellmanFord(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    // Bellman Ford Algorithm
    public void doFindShortPathDistance(int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, INFINITY);

        distance[source] = 0;

        // relax all edges v-1 times
        for (int i = 1; i < vertices; i++) {
            // for all positive-weight cycle
            for (Edge edge : edges) {
                int u = edge.source;
                int v = edge.destination;
                int w = edge.weight;

                if (distance[u] != INFINITY && (distance[u] + w) < distance[v]) {
                    distance[v] = distance[u] + w;
                }
            }
        }
    }

//    public void doDepthFirstTraversal(int startingNode, boolean[] visited) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(startingNode);
//
//        while (!stack.isEmpty()) {
//            int currentNode = stack.pop();
//
//            if (!visited[currentNode]) {
//                visited[currentNode] = true;
//
//                for (Integer neighbor : adjacencyList[currentNode])
//                    if (!visited[neighbor]) stack.push(neighbor);
//            }
//        }
//    }
//
//    public void doBreadthFirstTraversal(int startingNode, boolean[] visited) {
//        Queue<Integer> queue = new ArrayDeque<>();
//
//        queue.add(startingNode);
//
//        while (!queue.isEmpty()) {
//            int currentNode = queue.poll();
//
//            if (!visited[currentNode]) {
//                visited[currentNode] = true;
//
//                for (Integer neighbor : adjacencyList[currentNode])
//                    if (!visited[neighbor]) queue.add(neighbor);
//            }
//        }
//    }

    public void showList() {
        for (Edge edge : edges) {
            System.out.println(edge.source + " -> " + edge.destination + " : " + edge.weight);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vertices: ");
        int vertices = scanner.nextInt();

        BellmanFord graph = new BellmanFord(vertices);

        System.out.print("Edges: ");
        int edges = scanner.nextInt();

        System.out.print("Source: ");
        int source = scanner.nextInt();

        System.out.println("Adding edges:");
        for (int i = 0; i < edges; i++) {
            int nodeSource = scanner.nextInt();
            int nodeDestination = scanner.nextInt();
            int nodeWeight = scanner.nextInt();
            graph.addEdge(nodeSource, nodeDestination, nodeWeight);
        }

        graph.showList();

        System.out.println("Shortest Distances: ");

        /*
            Test Case 1:
            Vertices: 6
            Edges: 6
            Source: 0
            Destination: 3
            Connect Edges (Source Destination Weight):
            0 1 8
            0 2 5
            1 3 7
            2 4 -6
            3 5 -2
            4 5 3

            Test Case 2:
            Vertices: 3
            Edges: 3
            Source: 0
            Destination: 3
            Connect Edges (Source Destination Weight):
            0 1 8
            0 2 5
            2 1 9
         */

    }

}
