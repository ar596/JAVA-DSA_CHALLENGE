import java.util.*;

class prob69 {
    static boolean canPlace(int[] a, int k, int d) {
        int cnt = 1, last = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] - last >= d) {
                cnt++;
                last = a[i];
                if (cnt == k)
                    return true;
            }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 8, 9 };
        Arrays.sort(a);
        int k = 3, l = 1, r = a[a.length - 1], ans = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            if (canPlace(a, k, m)) {
                ans = m;
                l = m + 1;
            } else
                r = m - 1;
        }
        System.out.println(ans);
    }
}
