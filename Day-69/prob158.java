class prob158{
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static boolean hasPathSum(Node root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return sum == root.data;
        return hasPathSum(root.left, sum - root.data) ||
               hasPathSum(root.right, sum - root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        System.out.println(hasPathSum(root, 9));
    }
}
