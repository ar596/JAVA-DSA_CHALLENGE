class prob80 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node reverse(Node h) {
        Node prev = null, cur = h;
        while (cur != null) {
            Node n = cur.next;
            cur.next = prev;
            prev = cur;
            cur = n;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node h = new Node(1);
        h.next = new Node(2);
        h.next.next = new Node(3);
        h = reverse(h);
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
