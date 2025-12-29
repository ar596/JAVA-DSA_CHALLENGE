
public class prob29 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 8 };
        int n = arr.length;
        int sum = 0;
        int lengthSum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        int missingValue = lengthSum - sum;
        System.out.println(missingValue);
        System.out.println(sum);

    }
}
