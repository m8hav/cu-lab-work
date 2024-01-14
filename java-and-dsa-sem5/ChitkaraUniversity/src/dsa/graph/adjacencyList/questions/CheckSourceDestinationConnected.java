package dsa.graph.adjacencyList.questions;

import java.util.*;

/*

Source to Destination Reachable in Undirected Graph or Not

 */

public class CheckSourceDestinationConnected {
    private int vertices;       // nodes
    private LinkedList<Integer>[] adjacencyList;
    public CheckSourceDestinationConnected(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[this.vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        // for undirected graph
        adjacencyList[destination].add(source);
    }

    public boolean isReachable(int source, int destination) {
        boolean visited[] = new boolean[vertices];

        // can use either DFS or BFS
//        doDepthFirstTraversal(startingNode, visited);
        doBreadthFirstTraversal(source, visited);

        return visited[destination];
    }

    public void doDepthFirstTraversal(int startingNode, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();

        stack.push(startingNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited[currentNode]) {
                visited[currentNode] = true;

                for (Integer neighbor : adjacencyList[currentNode])
                    if (!visited[neighbor]) stack.push(neighbor);
            }
        }
    }

    public void doBreadthFirstTraversal(int startingNode, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(startingNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            if (!visited[currentNode]) {
                visited[currentNode] = true;

                for (Integer neighbor : adjacencyList[currentNode])
                    if (!visited[neighbor]) queue.add(neighbor);
            }
        }
    }

    public void showList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (Integer neighbor : adjacencyList[i])
                System.out.print(neighbor + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vertices: ");
        int vertices = scanner.nextInt();

        CheckSourceDestinationConnected graph = new CheckSourceDestinationConnected(vertices);

        System.out.print("Edges: ");
        int edges = scanner.nextInt();

        System.out.print("Source: ");
        int source = scanner.nextInt();

        System.out.print("Destination: ");
        int destination = scanner.nextInt();

        System.out.println("Connect Vertices (source <space> destination:");
        for (int i = 0; i < edges; i++) {
            int nodeSource = scanner.nextInt();
            int nodeDestination = scanner.nextInt();
            graph.addEdge(nodeSource, nodeDestination);
        }

        graph.showList();

        System.out.println("Source to Destination Reachable: " + graph.isReachable(source, destination));

        // Test Case 1: not connected
        // 0 - 1   4 - 5
        // |   |   |
        // 2   3   6
        // Vertices: 7
        // Edges: 5
        // Source: 0
        // Destination: 6
        // Connect Vertices:
        // 0 1
        // 0 2
        // 1 3
        // 4 5
        // 4 6

        // Test Case 2: connected
        // 0 - 1 - 4 - 5
        // |   |   |
        // 2   3   6
        // Vertices: 7
        // Edges: 6
        // Source: 0
        // Destination: 6
        // Connect Vertices:
        // 0 1
        // 0 2
        // 1 3
        // 1 4
        // 4 5
        // 4 6
    }

}
