public class prob48 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
        int n = arr.length;

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        int newLength = i + 1;

        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
