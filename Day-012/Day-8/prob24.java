import java.util.Scanner;
public class prob24 {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
System.out.println("Enter the value to search:");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
           if(target==arr[i]){
             System.out.println("target :"+ target);
           }
        }
       
    }
}
