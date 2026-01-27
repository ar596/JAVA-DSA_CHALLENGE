

public class prob26 {
    public static void main(String[] args) {
        int[] arr={56,89,23,88,55};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }
            else if(num>second &&num!=first){
                second=num;

            }
        }
        System.out.println("second number is "+second);
    }
}
