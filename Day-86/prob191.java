import java.util.*;

class prob191{
    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                dfs(neigh, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(4);
        adj.get(1).add(2);
        adj.get(1).add(3);

        boolean[] visited = new boolean[V];
        dfs(0, visited, adj);
    }
}
