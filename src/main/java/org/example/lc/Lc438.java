package org.example.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc438 {
    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        char[] charArray = p.toCharArray();
        Arrays.sort(charArray);
        String s1 = new String(charArray);
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String substring = s.substring(i, i+ p.length());
            char[] arr = substring.toCharArray();
            Arrays.sort(arr);
            if (s1.equals(new String(arr))) {
                list.add(i);
            }
        }
        return list;
    }
}
