class prob103 {
    public static void main(String[] args) {
        int[][] m = { { 1, 0, 1, 0 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 } };
        int[] h = new int[m[0].length];
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < h.length; j++)
                h[j] = m[i][j] == 0 ? 0 : h[j] + 1;
            max = Math.max(max, calc(h));
        }
        System.out.println(max);
    }

    static int calc(int[] h) {
        java.util.Stack<Integer> st = new java.util.Stack<>();
        int max = 0, i = 0;
        while (i < h.length) {
            if (st.isEmpty() || h[st.peek()] <= h[i])
                st.push(i++);
            else {
                int tp = st.pop();
                max = Math.max(max, h[tp] * (st.isEmpty() ? i : i - st.peek() - 1));
            }
        }
        while (!st.isEmpty()) {
            int tp = st.pop();
            max = Math.max(max, h[tp] * (st.isEmpty() ? i : i - st.peek() - 1));
        }
        return max;
    }
}
