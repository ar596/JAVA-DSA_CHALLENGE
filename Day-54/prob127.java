import java.util.*;

class prob127 {
    static void firstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < k; i++)
            if (arr[i] < 0)
                q.add(i);

        for (int i = k; i <= arr.length; i++) {
            System.out.print(q.isEmpty() ? "0 " : arr[q.peek()] + " ");
            if (!q.isEmpty() && q.peek() <= i - k)
                q.poll();
            if (i < arr.length && arr[i] < 0)
                q.add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { -8, 2, 3, -6, 10 };
        firstNegative(arr, 2);
    }
}
