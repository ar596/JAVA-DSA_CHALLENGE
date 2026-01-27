import java.util.Scanner;
public class prob17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0 || n%4==0){
            System.out.println(n +" it is leap year");
        }
        else{
            System.out.println(n +" it is not a leap year");
        }
    }
    
}
