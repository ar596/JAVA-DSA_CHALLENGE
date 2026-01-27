class prob167 {
    static class Node {
        int data; Node left,right,next;
        Node(int d){data=d;}
    }

    static Node prev=null;

    static void populate(Node root){
        if(root==null) return;
        populate(root.left);
        if(prev!=null) prev.next=root;
        prev=root;
        populate(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        populate(root);
        System.out.println(root.left.next.data);
    }
}
