import java.util.*;

class prob104 {
    static int prec(char c) {
        if (c == '+' || c == '-')
            return 1;
        if (c == '*' || c == '/')
            return 2;
        return -1;
    }

    public static void main(String[] args) {
        String s = "a+b*c";
        Stack<Character> st = new Stack<>();
        String res = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                res += c;
            else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(c))
                    res += st.pop();
                st.push(c);
            }
        }
        while (!st.isEmpty())
            res += st.pop();
        System.out.println(res);
    }
}
