import java.util.*;

public class prob54 {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i])
                j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, i + 1);
    }

    static void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            int t = nums[start];
            nums[start++] = nums[end];
            nums[end--] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
