import java.util.*;

class prob197 {
    static class Pair {
        int node, dist;
        Pair(int n, int d) {
            node = n; dist = d;
        }
    }

    static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        dist[0] = 0;
        pq.add(new Pair(0,0));

        while (!pq.isEmpty()) {
            Pair cur = pq.poll();
            int u = cur.node;

            for (Pair neigh : adj.get(u)) {
                int v = neigh.node;
                int wt = neigh.dist;

                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(4, 1));
        adj.get(1).add(new Pair(2, 3));
        adj.get(4).add(new Pair(2, 2));

        dijkstra(V, adj);
    }
}
