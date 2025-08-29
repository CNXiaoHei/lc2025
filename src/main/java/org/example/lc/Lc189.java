package org.example.lc;

import java.util.Arrays;

public class Lc189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        // 翻转整个数组
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        // 翻转0-k
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = temp;
        }

        // 翻转k-n
        for (int i = k; i < (nums.length + k) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length + k - 1 - i];
            nums[nums.length + k - 1 - i] = temp;
        }
    }

    public static void rotate1(int[] nums, int k) {
        int[] ints = new int[nums.length];
        for (int i = k; i > 0; i--) {
            ints[k - i] = nums[nums.length - i];
        }
        for (int i = 0; i < nums.length - k; i++) {
            ints[k + i] = nums[i];
        }
        System.arraycopy(ints, k, nums, 0, nums.length);
    }
}
