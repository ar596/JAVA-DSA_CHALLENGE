class prob151 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int height(Node root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
    }

    static boolean isBalanced(Node root) {
        return height(root) != -1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        System.out.println(isBalanced(root));
    }
}
