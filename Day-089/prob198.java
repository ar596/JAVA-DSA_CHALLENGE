import java.util.*;

class prob198 {
    static boolean isPath(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(grid[i][j]==1) q.add(new int[]{i,j});

        int[] dx={1,-1,0,0}, dy={0,0,1,-1};

        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0], y=cur[1];

            if(grid[x][y]==2) return true;

            for(int d=0;d<4;d++){
                int nx=x+dx[d], ny=y+dy[d];
                if(nx>=0 && ny>=0 && nx<n && ny<n && !vis[nx][ny] && grid[nx][ny]!=0){
                    vis[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid={{1,3,0},{3,3,3},{0,3,2}};
        System.out.println(isPath(grid));
    }
}
