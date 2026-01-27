import java.util.Scanner;

public class prob16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        String num=String.valueOf(n);
        String sqr=String.valueOf(sq);
        if(sqr.endsWith(num)){
            System.out.println(n+" It is Automorphic number");
        }
        else{
            System.out.println(n+"It is not a Automorphic number");
        }
        sc.close();
    }
}
