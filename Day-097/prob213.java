import java.util.*;

public class prob213 {

    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = new ArrayList<>();
        restoreIP(s, 0, 0, "", result);

        for (String ip : result) {
            System.out.println(ip);
        }
    }

    static void restoreIP(String s, int index, int dots, String current, List<String> result) {
        if (dots == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }

        if (dots > 4) return;

        for (int i = index; i < Math.min(index + 3, s.length()); i++) {
            String part = s.substring(index, i + 1);

            if (isValid(part)) {
                restoreIP(s, i + 1, dots + 1, current + part + ".", result);
            }
        }
    }

    static boolean isValid(String part) {
        if (part.length() > 1 && part.startsWith("0")) return false;
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}
