import java.util.*;

class prob70 {
    static int search(int[] arr, int key) {
        int peak = findPeak(arr);
        int idx = ascBinary(arr, 0, peak, key);
        if (idx != -1)
            return idx;
        return descBinary(arr, peak + 1, arr.length - 1, key);
    }

    static int findPeak(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < arr[m + 1])
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    static int ascBinary(int[] a, int l, int r, int k) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == k)
                return m;
            if (a[m] < k)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    static int descBinary(int[] a, int l, int r, int k) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == k)
                return m;
            if (a[m] > k)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 12, 4, 2 };
        System.out.println(search(arr, 4));
    }
}
