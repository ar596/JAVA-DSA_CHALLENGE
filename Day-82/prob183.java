class prob183 {
    static void gen(int open,int close,String s){
        if(open==0 && close==0){
            System.out.println(s);
            return;
        }
        if(open>0) gen(open-1,close,s+"(");
        if(close>open) gen(open,close-1,s+")");
    }

    public static void main(String[] args) {
        gen(3,3,"");
    }
}
