package org.example.lc;

public class Lc283 {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int noZero = 0;
        while (zero < nums.length) {
            if (nums[zero] == 0) {
                while (noZero < nums.length && nums[noZero] == 0) {
                    noZero++;
                }
                if (noZero >= nums.length) {
                    return;
                }
                nums[zero] = nums[noZero];
                nums[noZero] = 0;
                zero++;
            } else {
                zero++;
                if (noZero < zero) {
                    noZero = zero;
                }
            }
        }
    }
}
