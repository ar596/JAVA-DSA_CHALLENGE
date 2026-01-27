class prob188 {
    static boolean solve(int[] a,boolean[] used,int k,int sum,int target){
        if(k==0) return true;
        if(sum==target) return solve(a,used,k-1,0,target);
        for(int i=0;i<a.length;i++){
            if(!used[i] && sum+a[i]<=target){
                used[i]=true;
                if(solve(a,used,k,sum+a[i],target)) return true;
                used[i]=false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={4,3,2,3,5,2,1};
        int k=4,sum=0;
        for(int x:a) sum+=x;
        System.out.println(solve(a,new boolean[a.length],k,0,sum/k));
    }
}
