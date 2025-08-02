package org.example.lc;

public class Lc1422 {
    public static void main(String[] args) {
        String s = "00111";
        int maxScore = maxScore(s);
        System.out.println(maxScore);
    }

    public static int maxScore(String s) {
        int[] scoresZ = new int[s.length() - 1];
        int[] scoresF = new int[s.length() - 1];
        char[] charArray = s.toCharArray();
        int scoreZ = 0;
        int scoreF = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (charArray[i] == '0') {
                scoreZ++;
            }
            scoresZ[i] = scoreZ;
            if (charArray[s.length() - 1 - i] == '1') {
                scoreF++;
            }
            scoresF[scoresF.length - 1 - i] = scoreF;
        }
        int maxScore = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            maxScore = Math.max(maxScore, scoresZ[i] + scoresF[i]);
        }
        return maxScore;
    }
}
