import java.util.Stack;

class prob113 {
    static int countRev(String s) {
        if (s.length() % 2 != 0)
            return -1;
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{')
                st.push(c);
            else {
                if (!st.isEmpty() && st.peek() == '{')
                    st.pop();
                else
                    st.push(c);
            }
        }
        int open = 0, close = 0;
        while (!st.isEmpty()) {
            if (st.pop() == '{')
                open++;
            else
                close++;
        }
        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println(countRev(s));
    }
}
