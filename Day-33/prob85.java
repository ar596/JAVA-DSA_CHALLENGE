
class prob85 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node delete(Node h, int m, int n) {
        Node c = h;
        while (c != null) {
            for (int i = 1; i < m && c != null; i++)
                c = c.next;
            if (c == null)
                break;
            Node t = c.next;
            for (int i = 0; i < n && t != null; i++)
                t = t.next;
            c.next = t;
            c = t;
        }
        return h;
    }

    public static void main(String[] args) {
        Node h = new Node(1);
        h.next = new Node(2);
        h.next.next = new Node(3);
        h.next.next.next = new Node(4);
        h = delete(h, 2, 1);
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
