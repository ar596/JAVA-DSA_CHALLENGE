class prob76 {
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 3, 1, 4, 2 };
        insertionSort(a);
        for (int x : a)
            System.out.print(x + " ");
    }
}
