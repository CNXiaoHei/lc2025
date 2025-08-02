package org.example.lc;

public class Lc326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(19684));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while (n > 3) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return n == 3;
    }
}
