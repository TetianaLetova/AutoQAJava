package com.andersen.lesson_7;

import java.util.Arrays;

public class BinaryArrayInverter {
    public static void invertBinaryArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }

        System.out.println("Inverted array: " + Arrays.toString(array));
    }
}
