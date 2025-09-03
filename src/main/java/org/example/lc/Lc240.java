package org.example.lc;

public class Lc240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean exist = false;
        int x = 0, y = 0;
        // 是否转向,默认x方向查找
        boolean vector = false;
        while (x < matrix[0].length && y < matrix.length) {
            if (matrix[y][x] == target) {
                return true;
            }
            if (!vector) {
                if (x >= matrix[0].length - 1 || matrix[y][x + 1] > target) {
                    vector = true;
                } else {
                    x++;
                }
            } else {
                if (x > 0 && matrix[y][x] > target) {
                    x--;
                } else {
                    y++;
                }
            }
        }
        return exist;
    }
}
