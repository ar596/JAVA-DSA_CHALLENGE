class prob88 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static int count(Node a, Node b) {
        int c = 0;
        while (a != null && b != null && a.data == b.data) {
            c++;
            a = a.next;
            b = b.next;
        }
        return c;
    }

    static int maxPalindrome(Node h) {
        int res = 0;
        Node prev = null, cur = h;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            res = Math.max(res, 2 * count(prev, next) + 1);
            res = Math.max(res, 2 * count(cur, next));
            prev = cur;
            cur = next;
        }
        return res;
    }

    public static void main(String[] args) {
        Node h = new Node(2);
        h.next = new Node(3);
        h.next.next = new Node(3);
        h.next.next.next = new Node(2);
        System.out.println(maxPalindrome(h));
    }
}
