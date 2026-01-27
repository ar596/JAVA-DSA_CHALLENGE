class prob171 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }
    static int postIndex;

    static Node build(int[] in,int[] post,int l,int r){
        if(l>r) return null;
        Node root=new Node(post[postIndex--]);
        int idx=l;
        while(in[idx]!=root.data) idx++;
        root.right=build(in,post,idx+1,r);
        root.left=build(in,post,l,idx-1);
        return root;
    }

    public static void main(String[] args) {
        int[] in={4,2,5,1,3};
        int[] post={4,5,2,3,1};
        postIndex=post.length-1;
        Node root=build(in,post,0,in.length-1);
        System.out.println(root.data);
    }
}
