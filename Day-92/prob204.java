import java.util.*;

class prob204 {
    static void topo(int V, ArrayList<ArrayList<Integer>> adj){
        int[] indeg=new int[V];
        for(int i=0;i<V;i++)
            for(int it:adj.get(i)) indeg[it]++;

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++) if(indeg[i]==0) q.add(i);

        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int it:adj.get(node)){
                if(--indeg[it]==0) q.add(it);
            }
        }
    }

    public static void main(String[] args){
        int V=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        adj.get(5).add(2); adj.get(5).add(0);
        adj.get(4).add(0); adj.get(4).add(1);
        adj.get(2).add(3); adj.get(3).add(1);
        topo(V,adj);
    }
}
