import java.util.*;

public class prob210 {

    public static void main(String[] args) {
        String s = "a1b2";
        List<String> result = new ArrayList<>();
        solve(0, s.toCharArray(), result);
        for (String str : result) {
            System.out.println(str);
        }
    }

    static void solve(int index, char[] arr, List<String> result) {
        if (index == arr.length) {
            result.add(new String(arr));
            return;
        }

        if (Character.isLetter(arr[index])) {
            // Lowercase
            arr[index] = Character.toLowerCase(arr[index]);
            solve(index + 1, arr, result);

            // Uppercase
            arr[index] = Character.toUpperCase(arr[index]);
            solve(index + 1, arr, result);
        } else {
            solve(index + 1, arr, result);
        }
    }
}
