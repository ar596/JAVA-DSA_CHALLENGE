import java.util.Arrays;

public class prob45 {
    public static void main(String[] args) {
        int[] arr1 = { 17, 8, 4, 5 };
        int[] arr2 = { 6, 9, 3, 1 };
        int k = 5;
        int[] merge = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[index++] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            merge[index++] = arr2[i];
        }
        Arrays.sort(merge);
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
        System.out.println();
        System.out.println("kth Element:" + merge[k - 1]);
    }
}
