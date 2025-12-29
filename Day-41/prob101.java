class prob101 {
    public static void main(String[] args) {
        int[] h = { 3, 0, 0, 2, 0, 4 };
        int l = 0, r = h.length - 1, lm = 0, rm = 0, res = 0;
        while (l < r) {
            if (h[l] <= h[r]) {
                lm = Math.max(lm, h[l]);
                res += lm - h[l++];
            } else {
                rm = Math.max(rm, h[r]);
                res += rm - h[r--];
            }
        }
        System.out.println(res);
    }
}
