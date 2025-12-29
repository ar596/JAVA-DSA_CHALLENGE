

public class palindrome {
    public static void main(String[] args) {
        int num=12345;
        int copy=num;
        int Rev=0;
        while(num!=0){
            int Digit=num%10;
            Rev=Rev*10+Digit;
            num=num/10;

        }
        if(Rev==copy){
            System.out.println("Its is a Palindrome Number");
        }
        else{
            System.out.println("It is not a Palindrome Number");
        }
    }
}
