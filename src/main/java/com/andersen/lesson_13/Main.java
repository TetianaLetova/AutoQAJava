package com.andersen.lesson_13;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Task 1: Unique Words ---");
        UniqueWords.processWords();

        System.out.println("--- Task 2: Phone Directory ---");
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.printTestData();
    }
}