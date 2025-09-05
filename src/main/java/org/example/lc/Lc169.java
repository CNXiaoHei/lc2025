package org.example.lc;

import java.util.HashMap;

public class Lc169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int i = majorityElement(nums);
        System.out.println(i);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }
}
