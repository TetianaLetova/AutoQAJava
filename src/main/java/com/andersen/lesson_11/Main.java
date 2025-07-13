package com.andersen.lesson_11;

public class Main {
    public static void main(String[] args) {
        String[][] goodArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] badSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] badDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArrayProcessor.sumArray(goodArray);
            System.out.println("Sum of goodArray: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error processing goodArray: " + e.getMessage());
        }

        try {
            int sum = ArrayProcessor.sumArray(badSizeArray);
            System.out.println("Sum of badSizeArray: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Error processing badSizeArray: " + e.getMessage());
        }

        try {
            int sum = ArrayProcessor.sumArray(badDataArray);
            System.out.println("Sum of badDataArray: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            if (e instanceof MyArrayDataException) {
                MyArrayDataException ex = (MyArrayDataException) e;
                System.out.println("Data error at [" + ex.getRow() + "][" + ex.getCol() + "]: " + ex.getMessage());
            } else {
                System.out.println("Error processing badDataArray: " + e.getMessage());
            }
        }
    }
}
