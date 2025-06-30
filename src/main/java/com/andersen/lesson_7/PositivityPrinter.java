package com.andersen.lesson_7;

public class PositivityPrinter {
    public static void printPositivity(int number) {
        if (number >= 0) {
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }
    }
}
