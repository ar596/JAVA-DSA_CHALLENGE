class prob114 {
    int[] q = new int[5];
    int front = 0, rear = 0;

    void enqueue(int x) {
        q[rear++] = x;
    }

    int dequeue() {
        return q[front++];
    }

    public static void main(String[] args) {
        prob114 q = new prob114();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
