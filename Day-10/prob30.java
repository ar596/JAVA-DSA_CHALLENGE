public class prob30 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 8 };
        int n = 8;
        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            if (num <= n) {
                present[num] = true;
            }
        }
        for (int i = 1; i < +n; i++) {
            if (!present[i]) {
                System.out.println(i + " ");
            }
        }
    }
}
