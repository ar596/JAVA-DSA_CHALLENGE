import java.util.*;

class prob129 {
    static int count(String s, int k) {
        int res = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < i + k; j++)
                set.add(s.charAt(j));
            if (set.size() == k - 1)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(count("aabab", 3));
    }
}
