class prob164 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }

    static Node lca(Node root,int a,int b){
        if(root==null) return null;
        if(a<root.data && b<root.data) return lca(root.left,a,b);
        if(a>root.data && b>root.data) return lca(root.right,a,b);
        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        System.out.println(lca(root,5,15).data);
    }
}
