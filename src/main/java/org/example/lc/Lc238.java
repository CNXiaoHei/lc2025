package org.example.lc;

public class Lc238 {

    public int[] productExceptSelf(int[] nums) {
        int[] arr1 = new int[nums.length];
        arr1[0] = nums[0];
        int[] arr2 = new int[nums.length];
        arr2[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            arr1[i] = arr1[i - 1] * nums[i];
            arr2[nums.length - 1 - i] = arr2[nums.length - 1 - i + 1] * nums[nums.length - 1 - i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int a = i - 1 >= 0 ? arr1[i - 1] : 1;
            int b = i + 1 <= nums.length - 1 ? arr2[i + 1] : 1;
            result[i] = a * b;
        }
        return result;
    }
}
