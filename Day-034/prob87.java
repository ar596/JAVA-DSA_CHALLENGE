class prob87 {
    static class Node {
        int data;
        Node next, random;

        Node(int d) {
            data = d;
        }
    }

    static Node clone(Node h) {
        Node c = h;
        while (c != null) {
            Node n = new Node(c.data);
            n.next = c.next;
            c.next = n;
            c = n.next;
        }
        c = h;
        while (c != null) {
            if (c.random != null)
                c.next.random = c.random.next;
            c = c.next.next;
        }
        Node d = new Node(0), t = d;
        c = h;
        while (c != null) {
            t.next = c.next;
            t = t.next;
            c.next = c.next.next;
            c = c.next;
        }
        return d.next;
    }

    public static void main(String[] args) {
        Node h = new Node(1);
        h.next = new Node(2);
        h.random = h.next;
        h.next.random = h;
        Node c = clone(h);
        System.out.println(c.data + " " + c.random.data);
    }
}
