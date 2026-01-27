import java.util.*;

public class prob215 {

    public static void main(String[] args) {
        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };

        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        findPaths(0, 0, maze, visited, "", n);
    }

    static void findPaths(int i, int j, int[][] maze, boolean[][] visited, String path, int n) {

        if (i == n-1 && j == n-1) {
            System.out.println(path);
            return;
        }

        if (i < 0 || j < 0 || i >= n || j >= n || maze[i][j] == 0 || visited[i][j])
            return;

        visited[i][j] = true;

        
        findPaths(i+1, j, maze, visited, path + "D", n);
        
        findPaths(i, j-1, maze, visited, path + "L", n);
        
        findPaths(i, j+1, maze, visited, path + "R", n);
        
        findPaths(i-1, j, maze, visited, path + "U", n);

        visited[i][j] = false; 
    }
}
