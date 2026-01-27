import java.util.*;

class prob179 {
    static void solve(int[] a,int target,int idx,List<Integer> temp){
        if(target==0){
            System.out.println(temp);
            return;
        }
        for(int i=idx;i<a.length;i++){
            if(i>idx && a[i]==a[i-1]) continue;
            if(a[i]>target) break;
            temp.add(a[i]);
            solve(a,target-a[i],i+1,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a={10,1,2,7,6,1,5};
        Arrays.sort(a);
        solve(a,8,0,new ArrayList<>());
    }
}
