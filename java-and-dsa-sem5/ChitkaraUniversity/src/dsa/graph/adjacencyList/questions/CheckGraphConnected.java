package dsa.graph.adjacencyList.questions;

import java.util.*;

/*

Undirected Graph Connected or Not

 */

public class CheckGraphConnected {
    private int vertices;       // nodes
    private LinkedList<Integer>[] adjacencyList;
    private boolean[] visited;

    public CheckGraphConnected(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[this.vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            visited[i] = false;
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        // for undirected graph
        adjacencyList[destination].add(source);
    }

    public boolean isConnected() {
        int startingNode = 0;

        // can use either DFS or BFS
//        doDepthFirstTraversal(startingNode);
        doBreadthFirstTraversal(startingNode);

        // check if all vertices are visited
        for (boolean isVisited : visited)
            if (!isVisited) return false;

        return true;
    }

    public void doDepthFirstTraversal(int startingNode) {
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

    public void doBreadthFirstTraversal(int startingNode) {
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

        CheckGraphConnected graph = new CheckGraphConnected(vertices);

        System.out.print("Edges: ");
        int edges = scanner.nextInt();

        System.out.println("Connect Vertices (source <space> destination:");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        graph.showList();

        System.out.println("Graph connected: " + graph.isConnected());

        // Test Case 1: connected
        // 0 - 1 - 3 - 5
        //     |   |
        //     2 - 4
        // Vertices: 6
        // Edges: 6
        // Connect Vertices:
        // 0 1
        // 1 2
        // 1 3
        // 2 4
        // 3 4
        // 3 5

        // Test Case 2: not connected
        // 0 - 1   3 - 5
        //     |   |
        //     2   4
        // Vertices: 6
        // Edges: 4
        // Connect Vertices:
        // 0 1
        // 1 2
        // 3 4
        // 3 5
    }

}
