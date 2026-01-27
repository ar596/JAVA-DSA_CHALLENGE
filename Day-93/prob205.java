import java.util.Arrays.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class prob205 {
    static boolean canFinish(int n, int[][] pre){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        int[] indeg=new int[n];

        for(int[] p:pre){
            adj.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) if(indeg[i]==0) q.add(i);

        int cnt=0;
        while(!q.isEmpty()){
            int u=q.poll(); cnt++;
            for(int v:adj.get(u)){
                if(--indeg[v]==0) q.add(v);
            }
        }
        return cnt==n;
    }

    public static void main(String[] args){
        int[][] pre={{1,0},{2,1}};
        System.out.println(canFinish(3,pre));
    }
}
