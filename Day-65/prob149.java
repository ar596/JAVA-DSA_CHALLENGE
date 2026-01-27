
class prob149 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean isSame(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.data == b.data &&
               isSame(a.left, b.left) &&
               isSame(a.right, b.right);
    }

    public static void main(String[] args) {
        Node r1 = new Node(1);
        r1.left = new Node(2);

        Node r2 = new Node(1);
        r2.left = new Node(2);

        System.out.println(isSame(r1, r2));
    }
}



