public class prob220 {

    public static void main(String[] args) {
        String a = "123";
        String b = "456";

        System.out.println(addStrings(a, b));
    }

    static String addStrings(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }
}
