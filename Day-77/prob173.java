class prob173 {
    static class Node {
        int data; Node left,right;
        Node(int d){data=d;}
    }

    static Node build(int[] parent){
        int n=parent.length;
        Node[] nodes=new Node[n];
        for(int i=0;i<n;i++) nodes[i]=new Node(i);
        Node root=null;
        for(int i=0;i<n;i++){
            if(parent[i]==-1) root=nodes[i];
            else{
                Node p=nodes[parent[i]];
                if(p.left==null) p.left=nodes[i];
                else p.right=nodes[i];
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int[] parent={-1,0,0,1,1,3};
        Node root=build(parent);
        System.out.println(root.data);
    }
}
