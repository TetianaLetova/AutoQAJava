package com.andersen.lesson_7;

import java.util.Arrays;

public class DiagonalFiller {
    public static void fillDiagonal() {
        int size = 5;
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
