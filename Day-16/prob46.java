public class prob46 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 3, 2, 5 };
        int k = 13;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        System.out.println(maxLen);
    }
}
