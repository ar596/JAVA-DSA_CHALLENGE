class prob84 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node reverse(Node h) {
        Node p = null, c = h;
        while (c != null) {
            Node n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        return p;
    }

    static Node delete(Node h) {
        h = reverse(h);
        int max = h.data;
        Node c = h;
        while (c.next != null) {
            if (c.next.data < max)
                c.next = c.next.next;
            else {
                c = c.next;
                max = c.data;
            }
        }
        return reverse(h);
    }

    public static void main(String[] args) {
        Node h = new Node(12);
        h.next = new Node(15);
        h.next.next = new Node(10);
        h.next.next.next = new Node(11);
        h = delete(h);
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
