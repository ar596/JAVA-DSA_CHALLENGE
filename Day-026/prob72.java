class prob72 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 4, 7 },
                { 2, 5, 8 },
                { 3, 6, 9 }
        };
        int target = 6;
        int r = 0, c = mat[0].length - 1;
        while (r < mat.length && c >= 0) {
            if (mat[r][c] == target) {
                System.out.println("Found");
                return;
            }
            if (mat[r][c] > target)
                c--;
            else
                r++;
        }
        System.out.println("Not Found");
    }
}
