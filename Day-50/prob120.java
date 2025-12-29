import java.util.*;

class prob120 {
    static void find(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            q.add(c);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1)
                q.remove();
            System.out.print(q.isEmpty() ? "-1 " : q.peek() + " ");
        }
    }

    public static void main(String[] args) {
        find("aabc");
    }
}
