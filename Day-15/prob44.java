public class prob44 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 4, 7, 7 };
        int i = 0;
        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];

            }
        }
        int newLength = i + 1;
        System.out.println("NewLength: " + newLength);
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + ",");
        }

    }
}