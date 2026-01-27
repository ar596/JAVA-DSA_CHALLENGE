import java.util.*;

public class prob218 {

    public static void main(String[] args) {
        int n = 4;
        int k = 9;
        System.out.println(getPermutation(n, k));
    }

    static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
            numbers.add(i);
        }
        numbers.add(n);

        k = k - 1; // convert to 0-based index
        StringBuilder result = new StringBuilder();

        while (true) {
            result.append(numbers.get(k / fact));
            numbers.remove(k / fact);

            if (numbers.size() == 0)
                break;

            k = k % fact;
            fact = fact / numbers.size();
        }

        return result.toString();
    }
}
