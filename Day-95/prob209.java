public class prob209 {

    public static void main(String[] args) {
        String input = "ABC";
        permutation(input, 1, "" + input.charAt(0));
    }

    static void permutation(String input, int index, String output) {
        if (index == input.length()) {
            System.out.println(output);
            return;
        }

        // Option 1: Add space
        permutation(input, index + 1, output + " " + input.charAt(index));

        // Option 2: No space
        permutation(input, index + 1, output + input.charAt(index));
    }
}
