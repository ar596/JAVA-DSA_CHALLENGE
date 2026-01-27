import java.util.*;

class prob139t {
    static int count(String s, String p) {
        int[] cnt = new int[26];
        for (char c : p.toCharArray())
            cnt[c - 'a']++;
        int k = p.length(), res = 0, diff = k;

        for (int i = 0; i < s.length(); i++) {
            if (cnt[s.charAt(i) - 'a']-- > 0)
                diff--;
            if (i >= k && ++cnt[s.charAt(i - k) - 'a'] > 0)
                diff++;
            if (diff == 0)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(count("forxxorfxdofr", "for"));
    }
}
