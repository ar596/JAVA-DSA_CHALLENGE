import java.util.*;

class prob107 {
    public static void main(String[] args) {
        String s = "(1+3)*2";
        System.out.println(eval(s));
    }

    static int eval(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                val.push(c - '0');
            else if (c == '(')
                op.push(c);
            else if (c == ')') {
                while (op.peek() != '(')
                    val.push(calc(val.pop(), val.pop(), op.pop()));
                op.pop();
            } else {
                while (!op.isEmpty() && op.peek() != '(')
                    val.push(calc(val.pop(), val.pop(), op.pop()));
                op.push(c);
            }
        }
        while (!op.isEmpty())
            val.push(calc(val.pop(), val.pop(), op.pop()));
        return val.pop();
    }

    static int calc(int b, int a, char c) {
        return c == '+' ? a + b : c == '-' ? a - b : c == '*' ? a * b : a / b;
    }
}
