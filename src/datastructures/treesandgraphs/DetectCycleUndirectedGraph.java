import java.util.*;

public class DetectCycleUndirectedGraph {

    static boolean dfs(int node, int parent,
                       List<List<Integer>> graph,
                       boolean[] visited) {

        visited[node] = true;

        for (int nbr : graph.get(node)) {
            if (!visited[nbr]) {
                if (dfs(nbr, node, graph, visited))
                    return true;
            } else if (nbr != parent)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {}
}
