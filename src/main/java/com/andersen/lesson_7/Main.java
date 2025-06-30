package com.andersen.lesson_7;

public class Main {
    public static void main(String[] args) {
        System.out.println(SumChecker.isSumBetween10And20(7, 5));
        PositivityPrinter.printPositivity(-3);
        System.out.println(IsNegativeChecker.isNegative(-10));
        StringRepeater.repeatString("Hello, Java!", 3);
        System.out.println(LeapYearChecker.isLeapYear(2024));
        System.out.println(LeapYearChecker.isLeapYear(1900));
        System.out.println(LeapYearChecker.isLeapYear(2000));
        BinaryArrayInverter.invertBinaryArray();
        ArrayFiller.fillArray();
        MultiplyIfLessThanSix.processArray();
        DiagonalFiller.fillDiagonal();

        int[] myArray = ArrayCreator.createArray(5, 7);
        ArrayCreator.printArray(myArray);

        int[] testArray1 = {1, 2, 3};
        ArrayShifter.shiftArray(testArray1, 1);
        ArrayShifter.printArray(testArray1);

        int[] testArray2 = {3, 5, 6, 1};
        ArrayShifter.shiftArray(testArray2, -2);
        ArrayShifter.printArray(testArray2);
    }
}
