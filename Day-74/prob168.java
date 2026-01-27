class prob168 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }
    static int sum=0;

    static void transform(Node root){
        if(root==null) return;
        transform(root.right);
        sum+=root.data;
        root.data=sum;
        transform(root.left);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        transform(root);
        System.out.println(root.data);
    }
}
