package org.example.lc;

public class Lc11 {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int value = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(max, value);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
