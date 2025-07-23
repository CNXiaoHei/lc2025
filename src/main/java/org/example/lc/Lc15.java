package org.example.lc;

import java.util.*;

public class Lc15 {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> lists = threeSum(a);
        System.out.println(lists);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int m = nums[j];
                int k = -n - m;
                if (map.containsKey(k)) {
                    //int index = map.get(k);

                    List<Integer> l = new ArrayList<>();
                    l.add(n);
                    l.add(m);
                    l.add(k);
                    l.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            return o1-o2;
                        }
                    });
                    if (!set.contains(l)) {
                        list.add(l);
                        set.add(l);
                    }
                }else {
                    map.put(m, j);
                }
            }
        }
        return list;
    }
}
