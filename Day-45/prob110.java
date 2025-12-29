import java.util.*;

class prob110 {
    static void sortedInsert(Stack<Integer> st, int x) {
        if (st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }
        int t = st.pop();
        sortedInsert(st, x);
        st.push(t);
    }

    static void sort(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int t = st.pop();
            sort(st);
            sortedInsert(st, t);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);
        sort(st);
        System.out.println(st);
    }
}
