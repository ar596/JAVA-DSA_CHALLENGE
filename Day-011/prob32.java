
public class prob32 {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 5, 5, 2, 2 };
        int count0 = 0;
        int count5 = 0;
        int count2 = 0;
        for (int num : arr) {
            if (num == 0)
                count0++;
            else if (num == 5)
                count5++;
            else
                count2++;
        }
        int i = 0;
        while (count0-- > 0)
            arr[i++] = 0;
        while (count2-- > 0)
            arr[i++] = 2;
        while (count5-- > 0)
            arr[i++] = 5;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
