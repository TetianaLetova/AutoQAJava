package com.andersen.lesson_7;

import java.util.Arrays;

public class ArrayCreator {

    public static int[] createArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return result;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
