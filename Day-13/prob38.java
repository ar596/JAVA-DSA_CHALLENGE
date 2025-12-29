public class prob38 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 3, 6 };
        int visited = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = visited;

                    }

                }
                System.out.println(arr[i] + "|" + count + " times");

            }

        }

    }
}
