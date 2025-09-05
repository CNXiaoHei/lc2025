package org.example.lc;

public class Lc136 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int i = nums[0];
        for (int j = 1; j < nums.length; j++) {
            i = i ^ nums[j];
        }
        return i;
    }
}
