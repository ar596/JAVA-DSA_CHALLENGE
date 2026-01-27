		class prob150 {
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

    static boolean isSubtree(Node root, Node sub) {
        if (root == null) return false;
        if (isSame(root, sub)) return true;
        return isSubtree(root.left, sub) || isSubtree(root.right, sub);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Node sub = new Node(2);

        System.out.println(isSubtree(root, sub));
    }
}
