import java.util.*;

class prob98 {
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 10, 8 };
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && st.peek() >= a[i])
                st.pop();
            System.out.print((st.isEmpty() ? -1 : st.peek()) + " ");
            st.push(a[i]);
        }
    }
}
