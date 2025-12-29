import java.util.*;

class prob134 {
    static int smallest(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr)
            set.add(x);
        int need = set.size(), l = 0, min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < arr.length; r++) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while (map.size() == need) {
                min = Math.min(min, r - l + 1);
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0)
                    map.remove(arr[l]);
                l++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1 };
        System.out.println(smallest(arr));
    }
}
