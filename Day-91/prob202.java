import java.util.Arrays;
class prob202 {
    static void dfs(int[][] img,int i,int j,int old,int newColor){
        if(i<0||j<0||i>=img.length||j>=img[0].length||img[i][j]!=old) return;
        img[i][j]=newColor;
        dfs(img,i+1,j,old,newColor);
        dfs(img,i-1,j,old,newColor);
        dfs(img,i,j+1,old,newColor);
        dfs(img,i,j-1,old,newColor);
    }

    public static void main(String[] args) {
        int[][] img={{1,1,1},{1,1,0},{1,0,1}};
        dfs(img,1,1,1,2);
        System.out.println(Arrays.deepToString(img));
    }
}
