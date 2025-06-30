package com.andersen.lesson_7;

import java.util.Arrays;

public class ArrayShifter {

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;
        if (len == 0) return;

        n = n % len;
        if (n < 0) {
            n = n + len;
        }

        reverse(arr, 0, len - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, len - 1);
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
