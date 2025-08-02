package org.example.lc;

import java.util.Stack;

public class Lc852 {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                peak = i;
                continue;
            }
            if (stack.peek() > arr[i]) {
                continue;
            } else {
                stack.push(arr[i]);
                peak = i;
            }
        }
        return peak;
    }
}
