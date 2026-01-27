import java.util.*;

class prob138 {
    static int longest(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] == 0 ? -1 : 1;
            if (map.containsKey(sum))
                max = Math.max(max, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1 };
        System.out.println(longest(arr));
    }
}
