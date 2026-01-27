import java.util.*;

class prob99 {
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 10, 8 };
        int[] res = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= a[i])
                st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }
        for (int x : res)
            System.out.print(x + " ");
    }
}
