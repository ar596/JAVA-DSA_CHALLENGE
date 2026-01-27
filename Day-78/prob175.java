class prob175 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }
    static int max=Integer.MIN_VALUE;

    static int sum(Node root){
        if(root==null) return 0;
        int s=root.data+sum(root.left)+sum(root.right);
        max=Math.max(max,s);
        return s;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(-2);
        root.right=new Node(3);
        sum(root);
        System.out.println(max);
    }
}
