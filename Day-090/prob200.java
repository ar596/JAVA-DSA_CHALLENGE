import java.util.*;

class prob200 {
    static int minCost(int[][] grid){
        int n=grid.length;
        int[][] dist=new int[n][n];
        for(int[] row:dist) Arrays.fill(row,Integer.MAX_VALUE);

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{grid[0][0],0,0});
        dist[0][0]=grid[0][0];

        int[] dx={1,-1,0,0}, dy={0,0,1,-1};

        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int cost=cur[0], x=cur[1], y=cur[2];

            for(int d=0;d<4;d++){
                int nx=x+dx[d], ny=y+dy[d];
                if(nx>=0 && ny>=0 && nx<n && ny<n){
                    if(cost+grid[nx][ny]<dist[nx][ny]){
                        dist[nx][ny]=cost+grid[nx][ny];
                        pq.add(new int[]{dist[nx][ny],nx,ny});
                    }
                }
            }
        }
        return dist[n-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minCost(grid));
    }
}
