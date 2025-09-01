package org.example.lc;

import java.util.HashMap;
import java.util.Map;

public class Lc76 {

    public String minWindow(String s, String t) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map1.containsKey(t.charAt(i))) {
                map1.put(t.charAt(i), map1.get(t.charAt(i)) + 1);
            } else {
                map1.put(t.charAt(i), 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        String minStr = "";

        int a = 0;
        int b = 0;
        while (b < s.length()) {
            char c = charArray[b];
            if (map1.containsKey(c)) {
                Integer i = map2.computeIfAbsent(c, key -> 0);
                map2.put(c, i + 1);
            }

            // 判断是否能删除尾
            while (true) {
                if (a == b) {
                    break;
                }
                char c1 = charArray[a];
                if (!map1.containsKey(c1)) {
                    a++;
                } else {
                    if (map2.containsKey(c1) && map2.get(c1) - 1 >= map1.get(c1)) {
                        map2.compute(c1, (k, ll) -> ll - 1);
                        a++;
                    } else {
                        break;
                    }
                }
            }

            // 增加后判断是否相等
            if (map1.size() == map2.size()) {
                boolean equal = true;
                for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
                    if (map2.get(entry.getKey()) < entry.getValue()) {
                        equal = false;
                        break;
                    }
                }
                if (equal) {
                    if (minStr.isEmpty()) {
                        minStr = s.substring(a, b + 1);
                    } else {
                        minStr = minStr.length() > (b - a) ? s.substring(a, b + 1) : minStr;
                    }
                }
            }
            b++;
        }
        return minStr;
    }
}
