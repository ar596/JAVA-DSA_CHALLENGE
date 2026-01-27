class prob156 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean isIso(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.data != b.data) return false;
        return (isIso(a.left, b.left) && isIso(a.right, b.right)) ||
               (isIso(a.left, b.right) && isIso(a.right, b.left));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        System.out.println(isIso(a, b));
    }
}
