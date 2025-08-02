package org.example.lc;

public class Lc263 {
    public static void main(String[] args) {

    }

    public static boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (n % 2 == 0) {
            return isUgly(n / 2);
        } else if (n % 3 == 0) {
            return isUgly(n / 3);
        } else if (n % 5 == 0) {
            return isUgly(n / 5);
        } else {
            return false;
        }
    }
}
