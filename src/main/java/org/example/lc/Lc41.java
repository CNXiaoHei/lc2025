package org.example.lc;

import java.util.HashMap;

public class Lc41 {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        int i = 1;
        while (map.containsKey(i)) {
            i++;
        }
        return i;
    }
}
