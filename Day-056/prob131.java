class prob131 {
    static boolean hasSum(int[] arr, int sum) {
        int curr = 0, l = 0;
        for (int r = 0; r < arr.length; r++) {
            curr += arr[r];
            while (curr > sum)
                curr -= arr[l++];
            if (curr == sum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        System.out.println(hasSum(arr, 33));
    }
}
