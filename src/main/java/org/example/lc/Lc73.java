package org.example.lc;

public class Lc73 {
    public void setZeroes(int[][] matrix) {
        boolean xZero = false;
        // 判断x是否有0
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                xZero = true;
                break;
            }
        }

        // 判断y是否有0
        boolean yZero = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                yZero = true;
                break;
            }
        }

        int x = 1;
        int y = 1;
        while (x < matrix[0].length && y < matrix.length) {
            // 置零
            if (matrix[y][x] == 0) {
                matrix[0][x] = 0;
                matrix[y][0] = 0;
            }
            x++;
            if (x >= matrix[0].length) {
                x = 1;
                y++;
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] != 0) {
                continue;
            }
            for (int j = 1; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] != 0) {
                continue;
            }
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        if (yZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        if (xZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}
