import java.util.*;

class prob186 {
    static boolean pal(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    static void solve(String s,List<String> temp){
        if(s.length()==0){
            System.out.println(temp);
            return;
        }
        for(int i=1;i<=s.length();i++){
            String part=s.substring(0,i);
            if(pal(part)){
                temp.add(part);
                solve(s.substring(i),temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        solve("aab",new ArrayList<>());
    }
}
