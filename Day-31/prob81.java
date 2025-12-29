class prob81 {
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

    static Node subtract(Node a, Node b) {
        a = reverse(a);
        b = reverse(b);
        Node d = new Node(0), c = d;
        int borrow = 0;
        while (a != null) {
            int sub = a.data - borrow - (b != null ? b.data : 0);
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else
                borrow = 0;
            c.next = new Node(sub);
            c = c.next;
            a = a.next;
            if (b != null)
                b = b.next;
        }
        return reverse(d.next);
    }

    public static void main(String[] args) {
        Node a = new Node(9);
        a.next = new Node(0);
        Node b = new Node(1);
        Node r = subtract(a, b);
        while (r != null) {
            System.out.print(r.data);
            r = r.next;
        }
    }
}
