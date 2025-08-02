package org.example.lc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lc1512 {
    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                List<Integer> list = hashMap.get(nums[i]);
                list.add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                hashMap.put(nums[i], list);
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            List<Integer> list = hashMap.get(num);
            if (list.size() == 1) {
                continue;
            }
            int finalI = i;
            long count1 = list.stream().filter(e -> e > finalI).count();
            count += (int) count1;
        }
        return count;
    }
}
