class prob170 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }
    static int preIndex=0;

    static Node build(int[] pre,int[] in,int l,int r){
        if(l>r) return null;
        Node root=new Node(pre[preIndex++]);
        int idx=l;
        while(in[idx]!=root.data) idx++;
        root.left=build(pre,in,l,idx-1);
        root.right=build(pre,in,idx+1,r);
        return root;
    }

    public static void main(String[] args) {
        int[] pre={1,2,4,5,3};
        int[] in={4,2,5,1,3};
        Node root=build(pre,in,0,in.length-1);
        System.out.println(root.data);
    }
}
