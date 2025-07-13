package com.andersen.lesson_11;

public class ArrayProcessor {

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Array must have 4 rows");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Row " + i + " must have 4 columns");
            }
        }

        int sum = 0;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                try {
                    int value = Integer.parseInt(array[row][col]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(row, col, "Invalid data: " + array[row][col]);
                }
            }
        }

        return sum;
    }
}
