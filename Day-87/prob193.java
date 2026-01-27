import java.util.*;

class prob193 {
    static boolean dfs(int node, boolean[] visited, boolean[] recStack, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        recStack[node] = true;

        for (int neigh : adj.get(node)) {
            if (!visited[neigh] && dfs(neigh, visited, recStack, adj))
                return true;
            else if (recStack[neigh])
                return true;
        }

        recStack[node] = false;
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
        boolean[] recStack = new boolean[V];

        System.out.println(dfs(0, visited, recStack, adj));
    }
}
