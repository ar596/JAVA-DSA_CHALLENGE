class prob73 {
    static boolean canEat(int[] piles, int h, int k) {
        int time = 0;
        for (int p : piles)
            time += (p + k - 1) / k;
        return time <= h;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int l = 1, r = 11, ans = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (canEat(piles, h, m)) {
                ans = m;
                r = m - 1;
            } else
                l = m + 1;
        }
        System.out.println(ans);
    }
}
