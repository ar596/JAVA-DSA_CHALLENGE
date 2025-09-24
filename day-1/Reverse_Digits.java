public class Reverse_Digits {
    public static void main(String[] args) {
        int num=12345;
        int Rev=0;
        while(num!=0){
            int Digit=num%10;
            Rev=Rev*10+Digit;
            num=num/10;

        }
        System.out.println(Rev); 

    }
}
