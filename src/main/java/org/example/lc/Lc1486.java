package org.example.lc;

public class Lc1486 {
    public static void main(String[] args) {
        int i = xorOperation(1, 7);
        System.out.println(i);
    }

    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            result ^= num;
        }
        return result;
    }
}
