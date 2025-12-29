import java.util.*;

class prob133 {
    static boolean exists(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int x : arr) {
            sum += x;
            if (sum == 0 || set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, -3, 1, 6 };
        System.out.println(exists(arr));
    }
}
