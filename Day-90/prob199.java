import java.util.*;

class prob199 {
    static int spread(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0,time=0;

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                if(grid[i][j]==2) q.add(new int[]{i,j});
                if(grid[i][j]==1) fresh++;
            }

        int[] dx={1,-1,0,0}, dy={0,0,1,-1};

        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                for(int d=0;d<4;d++){
                    int nx=cur[0]+dx[d], ny=cur[1]+dy[d];
                    if(nx>=0 && ny>=0 && nx<n && ny<m && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        fresh--;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            time++;
        }
        return fresh==0?time:-1;
    }

    public static void main(String[] args) {
        int[][] grid={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(spread(grid));
    }
}
