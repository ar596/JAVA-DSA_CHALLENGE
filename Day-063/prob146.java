class prob146 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int diameter(Node root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh + rh + 1,
                Math.max(diameter(root.left), diameter(root.right)));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(diameter(root));
    }
}
