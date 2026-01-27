import java.util.*;

class prob196 {
    static boolean bfs(int start, int[] color, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neigh : adj.get(node)) {
                if (color[neigh] == -1) {
                    color[neigh] = 1 - color[node];
                    q.add(neigh);
                } else if (color[neigh] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);

        int[] color = new int[V];
        Arrays.fill(color, -1);

        System.out.println(bfs(0, color, adj));
    }
}
