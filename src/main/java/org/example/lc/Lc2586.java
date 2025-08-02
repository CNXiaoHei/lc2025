package org.example.lc;

public class Lc2586 {
    public static void main(String[] args) {
        String[] arr = {"hey","aeo","mu","ooo","artro"};
        int i = vowelStrings(arr, 1, 4);
        System.out.println(i);
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];
            if ((word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')
            && (word.charAt(word.length() - 1) == 'a' || word.charAt(word.length() - 1) == 'e' || word.charAt(word.length() - 1) == 'i' || word.charAt(word.length() - 1) == 'o' || word.charAt(word.length() - 1) == 'u')) {
                count++;
            }
        }
        return count;
    }
}
