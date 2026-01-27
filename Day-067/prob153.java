class prob153 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static int sum(Node root) {
        if (root == null) return 0;
        int old = root.data;
        root.data = sum(root.left) + sum(root.right);
        return root.data + old;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(3);
        sum(root);
        System.out.println(root.data);
    }
}
