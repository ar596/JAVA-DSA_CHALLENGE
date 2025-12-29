import java.util.Stack;

class prob94 {
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;
                char o = st.pop();
                if ((c == ')' && o != '(') || (c == '}' && o != '{') || (c == ']' && o != '['))
                    return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
    }
}
