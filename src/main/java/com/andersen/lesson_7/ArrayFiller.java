package com.andersen.lesson_7;

import java.util.Arrays;

public class ArrayFiller {
    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Filled array: " + Arrays.toString(array));
    }
}
