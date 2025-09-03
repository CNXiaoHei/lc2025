package org.example.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] path = new int[matrix.length + 2][matrix[0].length + 2];
        Arrays.fill(path[0], 1);
        Arrays.fill(path[matrix.length + 1], 1);
        for (int i = 0; i < matrix.length + 2; i++) {
            path[i][0] = 1;
            path[i][matrix[0].length + 1] = 1;
        }
        int x = 0;
        int y = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int vector = 0;
        int[][] vectorArr = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while (x < matrix[0].length + 2 && y < matrix.length + 2) {
            if (path[y][x + 1] == 1 && path[y + 1][x] == 1
                    && path[y][x - 1] == 1 && path[y - 1][x] == 1) {
                break;
            }
            vector = vector % 4;
            if (path[y + vectorArr[vector][0]][x + vectorArr[vector][1]] == 0) {
                y += vectorArr[vector][0];
                x += vectorArr[vector][1];
            } else {
                vector++;
                continue;
            }
            list.add(matrix[y - 1][x - 1]);
            path[y][x] = 1;
        }
        return list;
    }
}
