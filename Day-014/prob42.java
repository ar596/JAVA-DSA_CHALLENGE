public class prob42 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 4, 6 };
        int sum = 6;
        int n = arr.length;
        boolean a = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;

                    a = true;

                }

            }

        }
        System.out.println("count is : " + count);
        if (!a) {
            System.out.println("Pair not found");
        }

    }
}
