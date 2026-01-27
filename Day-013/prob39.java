public class prob39 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6 };
        int sum = 6;
        int n = arr.length;
        boolean a = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("pair found :(" + arr[i] + "," + arr[j] + ")");
                    a = true;
                }
            }
        }
        if (!a) {
            System.out.println("Pair not found");
        }
    }
}
