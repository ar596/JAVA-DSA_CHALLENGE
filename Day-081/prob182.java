class prob182 {
    static int N=4;

    static boolean safe(char[][] b,int r,int c){
        for(int i=0;i<r;i++) if(b[i][c]=='Q') return false;
        for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(b[i][j]=='Q') return false;
        for(int i=r,j=c;i>=0&&j<N;i--,j++) if(b[i][j]=='Q') return false;
        return true;
    }

    static void solve(char[][] b,int r){
        if(r==N){
            for(char[] row:b) System.out.println(row);
            System.out.println();
            return;
        }
        for(int c=0;c<N;c++){
            if(safe(b,r,c)){
                b[r][c]='Q';
                solve(b,r+1);
                b[r][c]='.';
            }
        }
    }

    public static void main(String[] args) {
        char[][] b=new char[N][N];
        for(char[] row:b) java.util.Arrays.fill(row,'.');
        solve(b,0);
    }
}
