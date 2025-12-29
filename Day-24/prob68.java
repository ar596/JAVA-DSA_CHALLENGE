class prob68 {
    public static void main(String[] args) {
        int[] a = { 1, 3, 20, 4 };
        for (int i = 0; i < a.length; i++) {
            if ((i == 0 || a[i] > a[i - 1]) && (i == a.length - 1 || a[i] > a[i + 1])) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
