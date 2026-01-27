import java.util.*;

class prob124 {
    static void sort(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (; i <= k; i++)
            pq.add(arr[i]);
        int idx = 0;
        for (; i < arr.length; i++) {
            arr[idx++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty())
            arr[idx++] = pq.poll();
    }

    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
        sort(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
