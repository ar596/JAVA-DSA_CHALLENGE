import java.util.Scanner;
public class prob10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+"is the greater value");
        }
        else if(b>a){
             System.out.println(b+"is the greater value");
        }
    else
     System.out.println("Both are equal");
    }
}
