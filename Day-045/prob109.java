import java.util.*;

class prob109 {
    static void insert(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int t = st.pop();
        insert(st, x);
        st.push(t);
    }

    static void reverse(Stack<Integer> st) {
        if (st.isEmpty())
            return;
        int t = st.pop();
        reverse(st);
        insert(st, t);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        reverse(st);
        System.out.println(st);
    }
}
