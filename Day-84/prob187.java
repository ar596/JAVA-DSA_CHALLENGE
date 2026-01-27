import java.util.*;

class prob187 {
    public static void main(String[] args) {
        int n=3,k=3;
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++) nums.add(i);
        int fact=1;
        for(int i=1;i<n;i++) fact*=i;
        k--;
        StringBuilder sb=new StringBuilder();
        while(nums.size()>0){
            sb.append(nums.remove(k/fact));
            k%=fact;
            if(nums.size()>0) fact/=nums.size();
        }
        System.out.println(sb);
    }
}
