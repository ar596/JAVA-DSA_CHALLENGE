import java.util.*;

class prob178 {
    static void solve(int[] a,int target,int idx,List<Integer> temp){
        if(target==0){
            System.out.println(temp);
            return;
        }
        for(int i=idx;i<a.length;i++){
            if(a[i]<=target){
                temp.add(a[i]);
                solve(a,target-a[i],i,temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] a={2,3,6,7};
        solve(a,7,0,new ArrayList<>());
    }
}
