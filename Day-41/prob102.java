import java.util.*;

class prob102 {
    public static void main(String[] args) {
        int[] h = { 6, 2, 5, 4, 5, 1, 6 };
        Stack<Integer> st = new Stack<>();
        int max = 0, i = 0;
        while (i < h.length) {
            if (st.isEmpty() || h[st.peek()] <= h[i])
                st.push(i++);
            else {
                int tp = st.pop();
                int area = h[tp] * (st.isEmpty() ? i : i - st.peek() - 1);
                max = Math.max(max, area);
            }
        }
        while (!st.isEmpty()) {
            int tp = st.pop();
            int area = h[tp] * (st.isEmpty() ? i : i - st.peek() - 1);
            max = Math.max(max, area);
        }
        System.out.println(max);
    }
}
