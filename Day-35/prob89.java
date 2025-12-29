class prob89 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        Node h = new Node(1);
        h.next = new Node(2);
        h.next.next = h;
        System.out.println(h.next.next.data);
    }
}
