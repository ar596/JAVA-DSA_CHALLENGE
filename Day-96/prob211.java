import java.util.*;

public class prob211 {

    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);

        for (String s : result) {
            System.out.println(s);
        }
    }

    static void generate(int n, int open, int close, String current, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generate(n, open + 1, close, current + "(", result);
        }

        if (close < open) {
            generate(n, open, close + 1, current + ")", result);
        }
    }
}
