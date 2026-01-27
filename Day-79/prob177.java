import java.util.*;

class prob177 {
    static void permute(int[] nums, boolean[] used, List<Integer> temp) {
        if(temp.size()==nums.length){
            System.out.println(temp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1])) continue;
            used[i]=true;
            temp.add(nums[i]);
            permute(nums,used,temp);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,1,2};
        Arrays.sort(nums);
        permute(nums,new boolean[nums.length],new ArrayList<>());
    }
}
