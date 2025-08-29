package org.example.lc;

import java.util.Arrays;
import java.util.Comparator;

public class Lc56 {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(arr -> arr[0]));
        int[][] result = new int[intervals.length][2];
        int[] tempArr = intervals[0];
        int count = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > tempArr[1]) {
                result[count] = tempArr;
                count++;
                tempArr = intervals[i];
            } else {
                tempArr[1] = Math.max(tempArr[1], intervals[i][1]);
            }
        }

        int[][] ints = new int[count+1][2];
        System.arraycopy(result, 0, ints, 0, count);
        ints[ints.length - 1] = tempArr;
        return ints;
    }
}
