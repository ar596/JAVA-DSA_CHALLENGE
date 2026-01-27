class prob172 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }
    static int idx=0;

    static Node build(int[] pre,int min,int max){
        if(idx>=pre.length) return null;
        int val=pre[idx];
        if(val<min||val>max) return null;
        Node root=new Node(val);
        idx++;
        root.left=build(pre,min,val);
        root.right=build(pre,val,max);
        return root;
    }

    public static void main(String[] args) {
        int[] pre={10,5,1,7,40,50};
        Node root=build(pre,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(root.data);
    }
}
