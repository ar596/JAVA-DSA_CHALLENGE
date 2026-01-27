class prob184 {
    static boolean solve(int[][] b){
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(b[i][j]==0){
                    for(int n=1;n<=9;n++){
                        if(valid(b,i,j,n)){
                            b[i][j]=n;
                            if(solve(b)) return true;
                            b[i][j]=0;
                        }
                    }
                    return false;
                }
        return true;
    }

    static boolean valid(int[][] b,int r,int c,int n){
        for(int i=0;i<9;i++)
            if(b[r][i]==n||b[i][c]==n||
               b[3*(r/3)+i/3][3*(c/3)+i%3]==n)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] board=new int[9][9];
        solve(board);
        System.out.println("Solved");
    }
}
