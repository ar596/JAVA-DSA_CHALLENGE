import java.util.*;

class prob192 {
    static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                if (dfs(neigh, node, visited, adj)) return true;
            } else if (neigh != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0); // cycle

        boolean[] visited = new boolean[V];
        System.out.println(dfs(0, -1, visited, adj));
    }
}
