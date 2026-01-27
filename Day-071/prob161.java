class prob161 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        System.out.println(search(root, 15));
    }
}
