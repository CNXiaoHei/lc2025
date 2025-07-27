package org.example.lc;

public class Lc287 {
    public static void main(String[] args) {
        int[] ints = {1,3,4,2,2};
        int duplicate = findDuplicate(ints);
        System.out.println(duplicate);
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
