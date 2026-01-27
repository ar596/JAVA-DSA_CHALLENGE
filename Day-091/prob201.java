import java.util.*;

class prob201 {
    static int ladderLength(String begin, String end, List<String> wordList){
        Set<String> set=new HashSet<>(wordList);
        Queue<String> q=new LinkedList<>();
        q.add(begin);
        int level=1;

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String word=q.poll();
                if(word.equals(end)) return level;

                for(int j=0;j<word.length();j++){
                    char[] arr=word.toCharArray();
                    for(char c='a';c<='z';c++){
                        arr[j]=c;
                        String next=new String(arr);
                        if(set.contains(next)){
                            q.add(next);
                            set.remove(next);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ladderLength("hit","cog",
        Arrays.asList("hot","dot","dog","lot","log","cog")));
    }
}
