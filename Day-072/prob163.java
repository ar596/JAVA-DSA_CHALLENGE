class prob163 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }

    static class Info {
        boolean isBST;
        int size,min,max;
        Info(boolean i,int s,int mn,int mx){
            isBST=i; size=s; min=mn; max=mx;
        }
    }

    static int ans=0;

    static Info largestBST(Node root){
        if(root==null) return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);

        Info l=largestBST(root.left);
        Info r=largestBST(root.right);

        if(l.isBST && r.isBST && root.data>l.max && root.data<r.min){
            int size=l.size+r.size+1;
            ans=Math.max(ans,size);
            return new Info(true,size,Math.min(root.data,l.min),Math.max(root.data,r.max));
        }
        return new Info(false,0,0,0);
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.right.left=new Node(6);
        root.right.right=new Node(20);
        largestBST(root);
        System.out.println(ans);
    }
}
