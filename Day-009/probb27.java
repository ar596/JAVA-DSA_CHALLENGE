import java.util.*;

public class probb27 {
    public static void main(String[] args) {
        String first="listen";
        String second="silent";
        char[] a=first.toCharArray();
        char[] b=second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("its a Anagram");
        }
        else{
            System.out.println("its not a Anagram");
        }
    }
}
