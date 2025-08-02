package org.example.lc;

public class Lc231 {
    public static void main(String[] args) {
        boolean powerOfTwo = isPowerOfTwo(16);
        System.out.println(powerOfTwo);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1 || n == 0) {
            return false;
        }
        while (n > 0) {
            if (n == 2) {
                return true;
            }
            if (n % 2 == 1) {
                return false;
            }
            n = n / 2;
        }
        return n == 0;
    }
}
