class prob59 {
    public static void main(String[] args) {
        int[][] mat = { { 0, 1 }, { 1, 1 } };
        int idx = -1, max = 0;

        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int v : mat[i])
                if (v == 1)
                    cnt++;
            if (cnt > max) {
                max = cnt;
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
