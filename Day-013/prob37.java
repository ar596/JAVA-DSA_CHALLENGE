import java.util.HashSet;

public class prob37 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        int[] B = { 1, 4, 6, 2 };
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : B) {
            set.add(num);
        }
        boolean subset = true;
        for (int num : A) {
            if (!set.contains(num)) {
                subset = false;
                break;
            }

        }

        if (subset) {
            System.out.println("Arrays A subset of B");
        } else {
            System.out.println("Arrays is not a A subset of B");

        }
    }
}
