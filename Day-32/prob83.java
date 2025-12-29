class prob83 {
    static class Node {
        int data;
        Node next, bottom;

        Node(int d) {
            data = d;
        }
    }

    static Node merge(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        if (a.data < b.data) {
            a.bottom = merge(a.bottom, b);
            return a;
        } else {
            b.bottom = merge(a, b.bottom);
            return b;
        }
    }

    static Node flatten(Node root) {
        if (root == null || root.next == null)
            return root;
        root.next = flatten(root.next);
        return merge(root, root.next);
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        Node res = flatten(head);
        while (res != null) {
            System.out.print(res.data + " ");
            res = res.bottom;
        }
    }
}
