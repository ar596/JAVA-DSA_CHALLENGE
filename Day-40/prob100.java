import java.util.*;

class prob100 {
    public static void main(String[] args) {
        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        Stack<Integer> st = new Stack<>();
        int[] span = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
            span[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        for (int x : span)
            System.out.print(x + " ");
    }
}
