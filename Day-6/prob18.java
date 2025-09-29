import java.util.Scanner;

public class prob18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;

        }
        if(temp%sum==0){
            System.out.println(temp +" is a Harshad number");

        }
        else{
            System.out.println(temp+" is not a Harshad number");
        }
    }
    
}
