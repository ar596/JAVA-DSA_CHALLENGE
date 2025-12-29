import java.util.Stack;

class prob95 {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    void push(int x) {
        s.push(x);
        if (min.isEmpty() || x <= min.peek())
            min.push(x);
    }

    void pop() {
        if (s.pop().equals(min.peek()))
            min.pop();
    }

    int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        prob95 ms = new prob95();
        ms.push(5);
        ms.push(3);
        ms.push(7);
        System.out.println(ms.getMin());
        ms.pop();
        ms.pop();
        System.out.println(ms.getMin());
    }
}
