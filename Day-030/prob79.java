class prob79 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node insert(Node h, int x) {
        if (h == null)
            return new Node(x);
        Node t = h;
        while (t.next != null)
            t = t.next;
        t.next = new Node(x);
        return h;
    }

    static Node delete(Node h, int x) {
        if (h == null)
            return null;
        if (h.data == x)
            return h.next;
        Node t = h;
        while (t.next != null && t.next.data != x)
            t = t.next;
        if (t.next != null)
            t.next = t.next.next;
        return h;
    }

    static boolean search(Node h, int x) {
        while (h != null) {
            if (h.data == x)
                return true;
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node h = null;
        h = insert(h, 1);
        h = insert(h, 2);
        h = insert(h, 3);
        h = delete(h, 2);
        System.out.println(search(h, 3));
    }
}
