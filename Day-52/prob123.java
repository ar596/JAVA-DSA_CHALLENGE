import java.util.*;

class prob123 {
    static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr)
            pq.add(x);
        int cost = 0;
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            cost += a + b;
            pq.add(a + b);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6 };
        System.out.println(minCost(arr));
    }
}
