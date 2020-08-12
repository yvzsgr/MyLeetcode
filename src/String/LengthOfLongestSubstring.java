package String;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    //test string = "abcabbcba"

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            System.out.println(s.charAt(i));
            if (map.containsKey(s.charAt(i))) {
                System.out.println(map);
                j = Math.max(j, map.get(s.charAt(i)) + 1);
                System.out.println(s.charAt(i) + " " + j);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
            System.out.println("max is " + max);
        }
        return max;
    }
}
