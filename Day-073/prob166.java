class prob166 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }
    static Node pre=null,suc=null;

    static void find(Node root,int key){
        if(root==null) return;
        if(root.data==key){
            if(root.left!=null){
                Node t=root.left;
                while(t.right!=null) t=t.right;
                pre=t;
            }
            if(root.right!=null){
                Node t=root.right;
                while(t.left!=null) t=t.left;
                suc=t;
            }
        } else if(key<root.data){
            suc=root;
            find(root.left,key);
        } else {
            pre=root;
            find(root.right,key);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        find(root,10);
        System.out.println(pre.data+" "+suc.data);
    }
}
