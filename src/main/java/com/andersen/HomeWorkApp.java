package com.andersen;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(2, -8);
        printColor(101);
        compareNumbers(5,-16);
    }

    private static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(int a, int b) {
//        int a = 10;
//        int b = -5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }


}
