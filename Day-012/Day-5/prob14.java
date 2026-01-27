public class prob14 {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
                 System.out.println(i);
            }
        }
            System.out.println(sum);
            if(sum==n){
                System.out.println(n+" is Perfect Number");
               
           }
           else{
            System.out.println(n+" is Not a perfect number");
           }
            }
            
        
    }

