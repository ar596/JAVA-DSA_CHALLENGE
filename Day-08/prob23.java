import java.util.Scanner;

public class prob23 {
    public static void main(String args[]){

    
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        for(int i=n-1;i>=0;i--){
            int rev=arr[i];
        
        System.out.print("Reversed :"+rev+" " );
        }
    }
}
