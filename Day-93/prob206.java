import java.util.*;

class prob206 {
    static void bellman(int V,int[][] edges){
        int[] dist=new int[V];
        Arrays.fill(dist,100000);
        dist[0]=0;

        for(int i=0;i<V-1;i++){
            for(int[] e:edges){
                int u=e[0],v=e[1],wt=e[2];
                if(dist[u]+wt<dist[v])
                    dist[v]=dist[u]+wt;
            }
        }

        for(int[] e:edges){
            if(dist[e[0]]+e[2]<dist[e[1]]){
                System.out.println("Negative Cycle Exists");
                return;
            }
        }
        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args){
        int[][] edges={{0,1,4},{1,2,-6},{2,3,2},{3,1,1}};
        bellman(4,edges);
    }
}
