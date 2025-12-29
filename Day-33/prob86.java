class prob86 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node delete(Node h, int x) {
        while (h != null && h.data == x)
            h = h.next;
        Node c = h;
        while (c != null && c.next != null) {
            if (c.next.data == x)
                c.next = c.next.next;
            else
                c = c.next;
        }
        return h;
    }

    public static void main(String[] args) {
        Node h = new Node(2);
        h.next = new Node(2);
        h.next.next = new Node(3);
        h.next.next.next = new Node(2);
        h = delete(h, 2);
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
