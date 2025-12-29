class prob90 {
    static class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
        }

    }

    static Node insert(Node head, int x) {
        Node n = new Node(x);
        n.next = head;
        if (head != null)
            head.prev = n;
        return n;
    }

    static Node delete(Node head, int x) {
        Node c = head;
        while (c != null) {
            if (c.data == x) {
                if (c.prev != null)
                    c.prev.next = c.next;
                else
                    head = c.next;
                if (c.next != null)
                    c.next.prev = c.prev;
                break;
            }
            c = c.next;
        }
        return head;
    }

    static Node reverse(Node head) {
        Node temp = null;
        while (head != null) {
            temp = head.prev;
            head.prev = head.next;
            head.next = temp;
            if (head.prev == null)
                return head;
            head = head.prev;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 1);
        head = delete(head, 2);
        head = reverse(head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
