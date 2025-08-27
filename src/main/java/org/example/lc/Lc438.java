package org.example.lc;

import java.util.ArrayList;
import java.util.List;

public class Lc438 {
    public static void main(String[] args) {
        var s = "abab";
        List<Integer> abc = findAnagrams(s, "ab");
        for (Integer i : abc) {
            System.out.println(i);
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            arr1[p.charAt(i) - 97]++;
        }
        for (int i = 0; i < p.length(); i++) {
            arr2[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            boolean target = true;
            for (int j = 0; j < 26; j++) {
                if (arr1[j] != arr2[j]) {
                    target = false;
                    break;
                }
            }
            if (target) {
                list.add(i);
            }
            arr2[s.charAt(i) - 97]--;
            arr2[s.charAt(i + p.length()) - 97]++;
        }
        boolean target = true;
        for (int j = 0; j < 26; j++) {
            if (arr1[j] != arr2[j]) {
                target = false;
                break;
            }
        }
        if (target) {
            list.add(s.length() - p.length());
        }
        return list;
    }
}
