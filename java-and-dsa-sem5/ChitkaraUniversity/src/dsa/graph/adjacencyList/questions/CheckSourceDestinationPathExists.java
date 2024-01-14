package dsa.graph.adjacencyList.questions;

import java.util.*;

/*

Source to Destination Path Exists in Directed Graph or Not

 */

public class CheckSourceDestinationPathExists {
    private int vertices;       // nodes
    private LinkedList<Integer>[] adjacencyList;
    public CheckSourceDestinationPathExists(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[this.vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public boolean doesPathExist(int source, int destination) {
        boolean visited[] = new boolean[vertices];
        System.out.println(visited[0]);
        return isPathExistsDFS(source, destination, visited);
    }

    private boolean isPathExistsDFS(int current, int destination, boolean[] visited) {
        visited[current] = true;

        // BASE CASE
        if (current == destination) return true;

        for (Integer neighbor : adjacencyList[current]) {
            if (!visited[neighbor])
                if (isPathExistsDFS(neighbor, destination, visited))
                    return true;
        }
        return false;
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

        CheckSourceDestinationPathExists graph = new CheckSourceDestinationPathExists(vertices);

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

        System.out.println("Source to Destination Path Exists: " + graph.doesPathExist(source, destination));

        // Test Case 1: not connected
        //  0    ->    1
        // \|/   |/   /|\
        //  2    <-    3
        // Vertices: 4
        // Edges: 5
        // Source: 0
        // Destination: 3
        // Connect Vertices:
        // 0 1
        // 0 2
        // 1 2
        // 3 1
        // 3 2

        // Test Case 1: connected
        //  0    ->    1
        // \|/   |/   /|\
        //  2    ->    3
        // Vertices: 4
        // Edges: 5
        // Source: 0
        // Destination: 3
        // Connect Vertices:
        // 0 1
        // 0 2
        // 1 2
        // 2 3
        // 3 1
    }

}
