package org.example.lc;

public class Lc1281 {
    public static void main(String[] args) {
        int i = subtractProductAndSum(234);
        System.out.println(i);
    }

    public static int subtractProductAndSum(int n) {
        if (n < 10) {
            return 0;
        }
        int a = 0;
        int b = 1;
        do {
            int num = n % 10;
            n = (n - num) / 10;
            a += num;
            b *= num;
        } while (n > 0);
        return b - a;
    }
}
