package dsa.graph.adjacencyList.questions;

import java.util.*;

/*

Directed Graph Strongly Connected or Not

Sir said:
Directed / Undirected edge exists between every pair of nodes,
no matter from which direction

Online definition says:
A path exists between all pairs of vertices.
i.e. each vertex should be reachable from every other vertex,
even if you have to move through multiple other vertices.
i.e. a direct edge not required

So, I think, online definition is correct.

According to code, online definition is correct.

In a directed graph:
if there is no outgoing edge from a vertex,
then it is not strongly connected.
(not sure about cases where every node has an outgoing edge
and still it is not strongly connected)

If there is no incoming edge to a vertex,
then it is not strongly connected.

 */

public class CheckGraphStronglyConnected {
    private int vertices;       // nodes
    private LinkedList<Integer>[] adjacencyList;

    public CheckGraphStronglyConnected(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[this.vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public boolean isStronglyConnected() {
        for (int i = 0; i < vertices; i++) {
            boolean[] visited = new boolean[vertices];
            doDepthFirstTraversal(i, visited);

            // check if all vertices are visited
            for (boolean isVisited : visited)
                if (!isVisited) return false;
        }
        return true;
    }

    public void doDepthFirstTraversal(int startingNode, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();

        stack.push(startingNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited[currentNode]) {
                visited[currentNode] = true;

                for (Integer neighbor : adjacencyList[currentNode]) {
                    if (!visited[neighbor]) stack.push(neighbor);
                }
            }
        }
    }

    public void doBreadthFirstTraversal(int startingNode, boolean[] visited) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(startingNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            for (Integer neighbor : adjacencyList[currentNode])
                if (!visited[neighbor])
                    queue.add(neighbor);
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

        CheckGraphStronglyConnected graph = new CheckGraphStronglyConnected(vertices);

        System.out.print("Edges: ");
        int edges = scanner.nextInt();

        System.out.println("Connect Vertices (source <space> destination:");
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        graph.showList();

        System.out.println("Graph strongly connected: " + graph.isStronglyConnected());

        /*

        Test Case 1: not strongly connected
        0 - 1
        | x |
        2 - 3
        (directed according to given edges direction)
        Vertices: 4
        Edges: 6
        Connect Vertices:
        0 1
        0 2
        0 3
        1 2
        1 3
        2 3

        Test Case 2: strongly connected
        0 - 1
        | x |
        2 - 3
        (directed according to given edges direction)
        Vertices: 4
        Edges: 5
        Connect Vertices:
        0 1
        0 2
        1 3
        2 3
        3 0


         */

    }

}
