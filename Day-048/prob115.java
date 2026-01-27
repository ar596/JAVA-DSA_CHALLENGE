class prob115 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node front, rear;

    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    int dequeue() {
        int val = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return val;
    }

    public static void main(String[] args) {
        prob115 q = new prob115();
        q.enqueue(5);
        q.enqueue(15);
        q.enqueue(25);
        System.out.println(q.dequeue());
    }
}
