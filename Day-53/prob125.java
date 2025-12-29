class prob125 {
    static int maxSum(int[] arr, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        max = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        System.out.println(maxSum(arr, 3));
    }
}
