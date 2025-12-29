import java.util.Scanner;

public class prob21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entyer the Size of the Array");
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int min=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        
        System.out.println("The Mximum number is "+min);
        sc.close();
    }
    
}
