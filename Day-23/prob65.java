class prob65 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7 };
        int x = 5, l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == x) {
                System.out.println(m);
                return;
            } else if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        System.out.println(-1);
    }
}
