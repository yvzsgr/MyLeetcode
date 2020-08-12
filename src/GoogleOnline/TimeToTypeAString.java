package GoogleOnline;

import java.util.HashMap;
import java.util.Map;

public class TimeToTypeAString {


    public int calculateTime(String keyboard, String word) {

        Map<Character, Integer> hashmap = new HashMap<Character,Integer>();
        for(int i=0; i<keyboard.length(); i++) {
            hashmap.put(keyboard.charAt(i),i);
        }

        int diff =hashmap.get(word.charAt(0));

        for(int i=1; i<word.length(); i++) {
            int n = hashmap.get(word.charAt(i));
            int m = hashmap.get(word.charAt(i-1));
            System.out.println("n= " +n+ "m= "+m);
            diff = diff + Math.abs(n-m);
        }

        return diff;
    }



}
