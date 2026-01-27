import java.util.*;

class prob132 {
    static int longest(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k)
                max = i + 1;
            if (!map.containsKey(sum))
                map.put(sum, i);
            if (map.containsKey(sum - k))
                max = Math.max(max, i - map.get(sum - k));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        System.out.println(longest(arr, 15));
    }
}
