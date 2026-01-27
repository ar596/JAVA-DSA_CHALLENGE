class prob155 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static void mirror(Node root) {
        if (root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        mirror(root);
        System.out.println(root.left.data);
    }
}
