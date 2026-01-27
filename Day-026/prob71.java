class prob71 {
    public static void main(String[] args) {
        int[][] mat = {
                { 0, 0, 1 },
                { 1, 1, 1 },
                { 0, 1, 1 }
        };
        int maxRow = -1, maxCount = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j : mat[i])
                if (j == 1)
                    count++;
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }
        System.out.println(maxRow);
    }
}
