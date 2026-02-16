import java.util.*;

public class DijkstraShortestPath {

    static class Edge {
        int node, weight;
        Edge(int n, int w) { node = n; weight = w; }
    }

    static int[] dijkstra(int V, List<List<Edge>> graph, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Edge> pq =
                new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        dist[src] = 0;
        pq.add(new Edge(src, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            for (Edge e : graph.get(cur.node)) {
                int newDist = dist[cur.node] + e.weight;

                if (newDist < dist[e.node]) {
                    dist[e.node] = newDist;
                    pq.add(new Edge(e.node, newDist));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {}
}
