import java.util.*;

class prob180 {
    static void solve(int k,int target,int start,List<Integer> temp){
        if(temp.size()==k && target==0){
            System.out.println(temp);
            return;
        }
        for(int i=start;i<=9;i++){
            if(i>target) break;
            temp.add(i);
            solve(k,target-i,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        solve(3,7,1,new ArrayList<>());
    }
}
