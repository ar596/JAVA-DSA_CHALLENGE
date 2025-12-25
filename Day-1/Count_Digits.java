

public class Count_Digits {
    public static void main(String[] args) {
        int num=222;
        int count=0;
        while(num!=0){
            int Digit=num%10;
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
    
}
