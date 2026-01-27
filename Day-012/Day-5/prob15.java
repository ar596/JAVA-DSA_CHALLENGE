public class prob15 {
    public static void main(String[] args) {
        int n=145;
        int sum=0;
        int temp=n;
        while(n!=0){

        int a=n%10;
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
            sum+=fact;
            n=n/10;
        
        }
        System.out.println(sum);
        if(sum==temp){
           System.out.println("It is Strong Number");
            
        
    
        }
        else{
            System.out.println("It is Not a Strong Number");
        }
        
    }
}
