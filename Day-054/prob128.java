import java.util.*;

class prob128 {
    static void maxSubarray(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peek() <= i - k)
                dq.poll();
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();
            dq.add(i);
            if (i >= k - 1)
                System.out.print(arr[dq.peek()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        maxSubarray(arr, 3);
    }
}
