package org.example.lc;

public class Lc1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ints = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ints[index++] = nums[i];
            ints[index++] = nums[i + n];
        }
        return ints;
    }
}
