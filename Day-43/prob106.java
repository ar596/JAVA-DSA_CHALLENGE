import java.util.*;

class prob106 {
    public static void main(String[] args) {
        String s = "*-A/BC-/AKL";
        Stack<String> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetter(c))
                st.push(c + "");
            else {
                String a = st.pop(), b = st.pop();
                st.push(a + b + c);
            }
        }
        System.out.println(st.pop());
    }
}
