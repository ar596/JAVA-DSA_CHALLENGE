class prob92 {
    int[] arr = new int[5];
    int top = -1;

    void push(int x) {
        arr[++top] = x;
    }

    int pop() {
        return arr[top--];
    }

    public static void main(String[] args) {
        prob92 s = new prob92();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
