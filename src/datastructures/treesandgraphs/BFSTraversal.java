import java.util.*;

public class BFSTraversal {

    static List<Integer> bfs(int V, int[][] edges, int start) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node);

            for (int nbr : graph.get(node)) {
                if (!visited[nbr]) {
                    visited[nbr] = true;
                    q.add(nbr);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {}
}
