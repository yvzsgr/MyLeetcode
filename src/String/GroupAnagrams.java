package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            //this one way
            char[] ca = new char[26];
            for (char c : s.toCharArray()) {
                ca[c - 'a']++;
//                System.out.println(c-'a');
            }
            //this is second one
//            char[] ca = s.toCharArray();
//            Arrays.sort(ca);

            String keyStr = String.valueOf(ca);
            System.out.println(keyStr);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
            System.out.println(map);
        }
        return new ArrayList<>(map.values());
    }
}
