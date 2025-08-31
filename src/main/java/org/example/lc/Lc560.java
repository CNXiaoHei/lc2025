package org.example.lc;

public class Lc560 {
    public static void main(String[] args) {
        int[] a = {1,1,1};
        int i = subarraySum(a, 2);
        System.out.println(i);
    }

    public static int subarraySum(int[] nums, int k) {
        int[] prefixArr = new int[nums.length + 1];
        prefixArr[1] = nums[0];
        for (int i = 2; i < prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + nums[i - 1];
        }
        int count = 0;
        for (int i = 0; i < prefixArr.length; i++) {
            for (int j = i + 1; j < prefixArr.length; j++) {
                if (prefixArr[j] - prefixArr[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
