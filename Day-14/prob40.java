public class prob40 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6 };
        int target = 7;
        int n = arr.length;
        boolean a = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("pair found :(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                        a = true;
                    }
                }
            }
        }
        if (!a) {
            System.out.println("Pair not found");
        }
    }
}
