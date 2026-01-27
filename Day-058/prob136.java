import java.util.*;

class prob136 {
    static String minWindow(String s, String t) {
        int[] freq = new int[256];
        for (char c : t.toCharArray())
            freq[c]++;
        int count = t.length(), l = 0, min = Integer.MAX_VALUE, start = 0;

        for (int r = 0; r < s.length(); r++) {
            if (freq[s.charAt(r)]-- > 0)
                count--;
            while (count == 0) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                if (++freq[s.charAt(l++)] > 0)
                    count++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("this is a test string", "tist"));
    }
}
