class prob57 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5 }, { 7, 9, 11 } };
        int x = 9;
        boolean found = false;

        for (int[] row : mat)
            for (int val : row)
                if (val == x)
                    found = true;

        System.out.println(found);
    }
}
