package org.example.lc;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class Lc3 {
    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("abcabcbb");
        System.out.println(i);
    }
    public static int lengthOfLongestSubstring(String s) {
        ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
        char[] charArray = s.toCharArray();
        int maxLength = 0;
        int currLength = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (arrayDeque.contains(c)) {
                while (arrayDeque.pollFirst() != c) {
                }
                arrayDeque.addLast(c);
                currLength = arrayDeque.size();
            } else {
                arrayDeque.addLast(c);
                currLength++;
            }
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }
}
