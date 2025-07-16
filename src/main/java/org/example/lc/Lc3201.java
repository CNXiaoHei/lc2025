package org.example.lc;

import java.util.Arrays;

public class Lc3201 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int i = maximumLength(a);
        System.out.println(i);
    }

    /**
     * 先将数组处理为2的余数
     * 分析题目可以得到会有三种情况，全单、全双、交替，后面就很好解了
     *
     * @param nums
     * @return
     */
    public static int maximumLength(int[] nums) {
        if (nums.length == 2) {
            return 2;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] % 2;
        }
        int dddMax = Arrays.stream(nums).sum();
        int sssMax = nums.length - dddMax;
        int maxLength = 1;
        int first = 0;
        int last = 1;
        while (last < nums.length) {
            int x = (nums[first] + nums[last]) % 2;
            if (x == 1) {
                first = last;
                last++;
                maxLength++;
            } else {
                last++;
            }
        }
        return Math.max(Math.max(dddMax, sssMax), maxLength);
    }
}
