import java.util.*;

class prob181 {
    static void solve(int[] a,int idx,List<Integer> temp){
        System.out.println(temp);
        for(int i=idx;i<a.length;i++){
            temp.add(a[i]);
            solve(a,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3};
        solve(a,0,new ArrayList<>());
    }
}
