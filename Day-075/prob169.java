class prob169 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }

    static Node delete(Node root,int key){
        if(root==null) return null;
        if(key<root.data) root.left=delete(root.left,key);
        else if(key>root.data) root.right=delete(root.right,key);
        else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            Node succ=root.right;
            while(succ.left!=null) succ=succ.left;
            root.data=succ.data;
            root.right=delete(root.right,succ.data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root=delete(root,10);
        System.out.println(root.data);
    }
}
