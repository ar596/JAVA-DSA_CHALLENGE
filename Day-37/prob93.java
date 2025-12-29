class prob93 {
    int[] arr = new int[6];
    int top1 = -1, top2 = arr.length;

    void push1(int x) {
        arr[++top1] = x;
    }

    void push2(int x) {
        arr[--top2] = x;
    }

    public static void main(String[] args) {
        prob93 s = new prob93();
        s.push1(1);
        s.push1(2);
        s.push2(9);
        s.push2(8);
        System.out.println(s.arr[0]);
        System.out.println(s.arr[5]);
    }
}
