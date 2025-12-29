import java.util.*;

class prob108 {
    static void insert(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int t = st.pop();
        insert(st, x);
        st.push(t);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        insert(st, 0);
        System.out.println(st);
    }
}
