package org.example.lc;

import java.util.HashMap;

public class Lc1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if (map.containsKey(second)) {
                return new int[]{i, map.get(second)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
