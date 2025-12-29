import java.util.Arrays;

public class prob49 {
    public static void main(String[] args) {
        int[] arr1 = { 17, 8, 4, 5 };
        int[] arr2 = { 6, 9, 3, 1 };
        int k = 5;

        int[] merge = new int[arr1.length + arr2.length];

        int idx = 0;
        for (int x : arr1)
            merge[idx++] = x;
        for (int x : arr2)
            merge[idx++] = x;

        Arrays.sort(merge);

        System.out.println("Kth Element: " + merge[k - 1]);
    }
}
