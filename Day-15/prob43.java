import java.util.Arrays;

class prob43 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 2, 3, 3, 2 };
        int[] arr2 = { 2, 4, 4, 1, 2 };
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {

                i++;
            } else {
                j++;

            }
        }
    }
}