class prob67 {
    public static void main(String[] args) {
        int n = 16, l = 0, r = n, ans = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (m * m <= n) {
                ans = m;
                l = m + 1;
            } else
                r = m - 1;
        }
        System.out.println(ans);
    }
}
