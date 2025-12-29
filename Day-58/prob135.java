class prob135 {
    static int smallest(int[] arr) {
        int[] cnt = new int[3];
        int l = 0, min = Integer.MAX_VALUE;
        for (int r = 0; r < arr.length; r++) {
            cnt[arr[r]]++;
            while (cnt[0] > 0 && cnt[1] > 0 && cnt[2] > 0) {
                min = Math.min(min, r - l + 1);
                cnt[arr[l++]]--;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1 };
        System.out.println(smallest(arr));
    }
}
