class prob66 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 2, 3 };
        int x = 2, f = -1, l = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                if (f == -1)
                    f = i;
                l = i;
            }
        }
        System.out.println(f + " " + l);
    }
}
