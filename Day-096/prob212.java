import java.util.*;

public class prob212 {

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        partition(0, s, new ArrayList<>(), result);

        for (List<String> list : result) {
            System.out.println(list);
        }
    }

    static void partition(int index, String s, List<String> current, List<List<String>> result) {
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                current.add(s.substring(index, i + 1));
                partition(i + 1, s, current, result);
                current.remove(current.size() - 1); // backtrack
            }
        }
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
