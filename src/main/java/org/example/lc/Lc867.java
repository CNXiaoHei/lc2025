package org.example.lc;

import java.util.Arrays;

public class Lc867 {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] transpose = transpose(m);
        System.out.println(Arrays.deepToString(transpose));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        return transMatrix;
    }
}
