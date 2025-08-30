package org.example.lc;

import java.util.Stack;

public class Lc42 {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int maxHeight = 0;
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            if (stack.isEmpty()) {
                stack.push(height[i]);
                maxHeight = height[i];
                continue;
            }
            if (maxHeight > height[i]) {
                stack.push(height[i]);
            } else {
                while (!stack.isEmpty()) {
                    water += maxHeight - stack.pop();
                }
                stack.push(height[i]);
                maxHeight = height[i];
            }
        }
        if (!stack.isEmpty()) {
            maxHeight = stack.pop();
            while (!stack.isEmpty()) {
                if (stack.peek() >= maxHeight) {
                    maxHeight = stack.pop();
                } else  {
                    water += maxHeight - stack.pop();
                }
            }
        }
        return water;
    }
}
