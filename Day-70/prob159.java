class prob159 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int max = Integer.MIN_VALUE;

    static int maxPath(Node root) {
        if (root == null) return 0;
        int l = Math.max(0, maxPath(root.left));
        int r = Math.max(0, maxPath(root.right));
        max = Math.max(max, l + r + root.data);
        return Math.max(l, r) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        maxPath(root);
        System.out.println(max);
    }
}
