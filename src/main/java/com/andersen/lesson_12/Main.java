package com.andersen.lesson_12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(header, data);

        String filePath = "data.csv";

        CSVWriter writer = new CSVWriter();
        writer.save(filePath, appData);

        CSVReader reader = new CSVReader();
        AppData loaded = reader.load(filePath);

        if (loaded != null) {
            System.out.println("Header: " + String.join(", ", loaded.getHeader()));
            System.out.println("Data:");
            for (int[] row : loaded.getData()) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
}
