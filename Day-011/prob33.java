public class prob33 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 2, 5, 4, 5 };
        if (arr1.length != arr2.length) {
            System.out.println("Arrays not equal");
            return;
        }
        boolean equal = true;
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                equal = false;
                break;

            }

        }
        if (equal) {

            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays not equal");
        }

    }
}
