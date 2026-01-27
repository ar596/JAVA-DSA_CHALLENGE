import java.util.*;

class prob176 {
    static void permute(char[] arr, int l) {
        if (l == arr.length) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = l; i < arr.length; i++) {
            swap(arr, l, i);
            permute(arr, l + 1);
            swap(arr, l, i);
        }
    }

    static void swap(char[] a, int i, int j) {
        char t = a[i]; a[i] = a[j]; a[j] = t;
    }

    public static void main(String[] args) {
        permute("ABC".toCharArray(), 0);
    }
}
