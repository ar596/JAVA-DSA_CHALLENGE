import java.util.*;

public class prob207 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);

        // Print all subsets
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Pick the element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, result);

        // Backtrack (remove last)
        current.remove(current.size() - 1);

        // Not pick the element
        generateSubsets(index + 1, nums, current, result);
    }
}
