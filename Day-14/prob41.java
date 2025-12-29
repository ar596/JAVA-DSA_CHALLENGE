
public class prob41 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 6 };
        int target = 15;
        int n = arr.length;
        boolean a = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {

                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            System.out.println(
                                    "pair found :(" + arr[i] + "," + arr[j] + "," + arr[k] + "," + arr[l] + ")");
                            a = true;
                        }
                    }
                }
            }
        }
        if (!a) {
            System.out.println("Pair not found");
        }

    }
}
