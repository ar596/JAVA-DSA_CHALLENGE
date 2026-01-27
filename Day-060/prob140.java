class prob140 {
    static int longest(int[] arr, int k) {
        int l = 0, zero = 0, max = 0;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] == 0)
                zero++;
            while (zero > k)
                if (arr[l++] == 0)
                    zero--;
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(longest(arr, 2));
    }
}
