package org.example.lc;

import java.util.Arrays;

public class Lc75 {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (p1 < p2) {
                    nums[p2] = 1;
                }
                nums[p1] = 0;
                p1++;
                p2++;

            } else if (nums[i] == 1) {
                nums[p2] = 1;
                p2++;
            } else {

            }
        }
        for (int i = p2; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}
