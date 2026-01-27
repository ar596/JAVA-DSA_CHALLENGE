import java.util.Stack;

class prob116 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        while (!s1.isEmpty())
            s2.push(s1.pop());
        int res = s2.pop();
        while (!s2.isEmpty())
            s1.push(s2.pop());
        return res;
    }

    public static void main(String[] args) {
        prob116 q = new prob116();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
    }
}
