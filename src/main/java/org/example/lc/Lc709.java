package org.example.lc;

public class Lc709 {
    public static void main(String[] args) {
        String s = "Hello";
        String lowerCase = toLowerCase(s);
        System.out.println(lowerCase);
    }

    public static String toLowerCase(String s) {
        // A-Z 65-90
        // a-z 97-122
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= 65 && c <= 90) {
                c += 32;
                charArray[i] = c;
            }
        }
        return new String(charArray);
    }
}
