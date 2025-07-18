package org.example.lc;

import java.util.*;

public class Lc49 {
    public static void main(String[] args) {

    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (map.containsKey(sortedStr)) {
                List<String> strings = map.get(sortedStr);
                strings.add(s);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(s);
                map.put(sortedStr, strings);
            }
        }
        return map.values().stream().toList();
    }
}
