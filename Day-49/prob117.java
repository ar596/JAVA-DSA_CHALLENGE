import java.util.LinkedList;
import java.util.Queue;

class prob117 {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++)
            q.add(q.remove());
    }

    int pop() {
        return q.remove();
    }

    public static void main(String[] args) {
        prob117 s = new prob117();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}
