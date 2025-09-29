import java.util.Scanner;
public class prob19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr=n*n;
        int sum=0;
        while(sqr!=0){
            int digit=sqr%10;
            sum+=digit;
            sqr=sqr/10;
            
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println(n+" is a Neon Number");
        }
        else{
            System.out.println(n+" is not a Neon Number");
        }
    }
}
