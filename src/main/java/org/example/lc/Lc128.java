package org.example.lc;

import java.util.HashSet;

public class Lc128 {
    public static void main(String[] args) {

    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (Integer i : set) {
            if (set.contains(i - 1)) {
                continue;
            }
            int length = 0;
            int start = i;
            while (set.contains(start)) {
                start++;
                length++;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}
