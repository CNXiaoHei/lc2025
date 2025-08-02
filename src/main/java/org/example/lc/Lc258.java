package org.example.lc;

public class Lc258 {
    public static void main(String[] args) {
        int i = addDigits(38);
        System.out.println(i);
    }

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int result = 0;
        do {
            int n = num % 10;
            num = (num - n) / 10;
            result += n;
        } while (num > 0);
        return addDigits(result);
    }
}
