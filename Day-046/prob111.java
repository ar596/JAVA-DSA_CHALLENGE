class prob111 {
    static int celebrity(int[][] M, int n) {
        int a = 0, b = n - 1;
        while (a < b) {
            if (M[a][b] == 1)
                a++;
            else
                b--;
        }
        for (int i = 0; i < n; i++) {
            if (i != a && (M[a][i] == 1 || M[i][a] == 0))
                return -1;
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] M = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };
        System.out.println(celebrity(M, 3));
    }
}
