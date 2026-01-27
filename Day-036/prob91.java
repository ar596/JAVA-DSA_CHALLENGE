class prob91 {
    static class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
        }
    }

    static void pairSum(Node head, int sum) {
        Node l = head, r = head;
        while (r.next != null)
            r = r.next;
        while (l != r && r.next != l) {
            int s = l.data + r.data;
            if (s == sum) {
                System.out.println(l.data + " " + r.data);
                l = l.next;
                r = r.prev;
            } else if (s < sum) {
                l = l.next;
            } else {
                r = r.prev;
            }
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;

        pairSum(head, 6);
    }
}
