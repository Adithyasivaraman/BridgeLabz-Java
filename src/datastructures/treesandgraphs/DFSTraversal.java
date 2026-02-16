import java.util.*;

public class DFSTraversal {

    static void dfs(int node, List<List<Integer>> graph,
                    boolean[] visited, List<Integer> result) {

        visited[node] = true;
        result.add(node);

        for (int nbr : graph.get(node))
            if (!visited[nbr])
                dfs(nbr, graph, visited, result);
    }

    public static void main(String[] args) {}
}
