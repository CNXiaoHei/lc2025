package org.example.lc;

public class Lc560 {
    public static void main(String[] args) {
        int[] a = {-1,-1,1};
        int i = subarraySum(a, 6);
        System.out.println(i);
    }

    public static int subarraySum(int[] nums, int k) {
        // todo not done
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < nums.length && left < nums.length) {
            if (left >= right) {
                right = left;
                sum = nums[left];
            } else {
//                sum += nums[right];
            }
            if (sum == k) {
                sum -= nums[left];
                left++;
                count++;
            } else if (sum < k) {
                right++;
                if (right >= nums.length) {
                    break;
                }
                sum += nums[right];
            } else {
                sum -= nums[left];
                left++;
            }
        }
        return count;
    }
}
