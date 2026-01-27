import java.util.Arrays;
class prob203 {
    static void dfs(char[][] b,int i,int j){
        if(i<0||j<0||i>=b.length||j>=b[0].length||b[i][j]!='O') return;
        b[i][j]='T';
        dfs(b,i+1,j); dfs(b,i-1,j); dfs(b,i,j+1); dfs(b,i,j-1);
    }

    public static void main(String[] args){
        char[][] b={{'X','O','X'},{'O','X','O'},{'X','O','X'}};
        int n=b.length,m=b[0].length;

        for(int i=0;i<n;i++){
            dfs(b,i,0); dfs(b,i,m-1);
        }
        for(int j=0;j<m;j++){
            dfs(b,0,j); dfs(b,n-1,j);
        }

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(b[i][j]=='O') b[i][j]='X';
                else if(b[i][j]=='T') b[i][j]='O';

        System.out.println(Arrays.deepToString(b));
    }
}
