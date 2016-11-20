import java.util.Map;
import java.util.HashMap;

class CountWord {
    Map<String, Integer> wc = new HashMap<String,Integer>();
    void countChar(char[] word) {
        String s;
        for(char c: word) {
             s=Character.toString(c);
            if(wc.containsKey(s)) {
                wc.put(s,wc.get(s)+1);
            }
            else {
                wc.put(s,1);
            }
        }  
        System.out.println(wc);
    }
    public static void main(String[] args) {
        char[] words="sangmyung university".toCharArray();
        CountWord cw=new CountWord();
        cw.countChar(words);
    }
}