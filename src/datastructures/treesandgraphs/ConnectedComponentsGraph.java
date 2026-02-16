import java.util.*;

public class ConnectedComponentsGraph {

    static void dfs(int node, List<List<Integer>> graph,
                    boolean[] visited) {

        visited[node] = true;

        for (int nbr : graph.get(node))
            if (!visited[nbr])
                dfs(nbr, graph, visited);
    }

    static int components(int V, List<List<Integer>> graph) {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {}
}
