class prob157 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static void printPaths(Node root, String path) {
        if (root == null) return;
        path += root.data + " ";
        if (root.left == null && root.right == null)
            System.out.println(path);
        printPaths(root.left, path);
        printPaths(root.right, path);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        printPaths(root, "");
    }
}
