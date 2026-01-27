import java.util.*;

class prob96 {
    public static void main(String[] args) {
        int[] a = { 4, 5, 2, 25 };
        Stack<Integer> st = new Stack<>();
        int[] res = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= a[i])
                st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }
        for (int x : res)
            System.out.print(x + " ");
    }
}
