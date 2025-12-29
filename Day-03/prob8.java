class prob8{
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("It is Armstrong Number");
        }
        else{
            System.out.println("It is Not a Armstrong Number");
        }
    }
}