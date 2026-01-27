
class prob162 {
    static class Node {
        int data; Node left, right;
        Node(int d){data=d;}
    }

    static int count(Node root, int l, int r) {
        if(root==null) return 0;
        if(root.data>=l && root.data<=r)
            return 1 + count(root.left,l,r) + count(root.right,l,r);
        else if(root.data<l) return count(root.right,l,r);
        else return count(root.left,l,r);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        System.out.println(count(root,5,15));
    }
}
