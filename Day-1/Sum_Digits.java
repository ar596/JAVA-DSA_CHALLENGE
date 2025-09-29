public class Sum_Digits {
    public static void main(String[] args) {
        int num=222678;
        int sum=0;
        while(num!=0){
            int Digit=num%10;
            sum=sum+Digit;
            num=num/10;
        }
        System.out.println(sum);
    }
}
