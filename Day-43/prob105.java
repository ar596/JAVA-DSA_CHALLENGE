import java.util.*;

class prob105 {
    public static void main(String[] args) {
        String s = "231*+9-";
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                st.push(c - '0');
            else {
                int b = st.pop(), a = st.pop();
                st.push(c == '+' ? a + b : c == '-' ? a - b : c == '*' ? a * b : a / b);
            }
        }
        System.out.println(st.pop());
    }
}
