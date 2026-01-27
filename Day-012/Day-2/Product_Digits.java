

public class Product_Digits {
    public static void main(String[] args) {
         int num=222;
        int Product=1;
        while(num!=0){
            int Digit=num%10;
            Product=Product*Digit;
            num=num/10;
        }
        System.out.println(Product);
    }
}
