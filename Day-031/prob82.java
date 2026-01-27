class prob82 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node rotate(Node h, int k) {
        if (h == null)
            return h;
        Node c = h;
        int len = 1;
        while (c.next != null) {
            c = c.next;
            len++;
        }
        c.next = h;
        k %= len;
        for (int i = 0; i < len - k; i++)
            c = c.next;
        Node nh = c.next;
        c.next = null;
        return nh;
    }

    public static void main(String[] args) {
        Node h = new Node(1);
        h.next = new Node(2);
        h.next.next = new Node(3);
        h = rotate(h, 1);
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
