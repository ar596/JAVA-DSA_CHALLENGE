import java.util.Stack;

class prob112 {
    static String crush(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c)
                st.pop();
            else
                st.push(c);
        }
        StringBuilder res = new StringBuilder();
        for (char c : st)
            res.append(c);
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(crush(s));
    }
}
