package com.andersen.lesson_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    public AppData load(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String headerLine = reader.readLine();
            if (headerLine == null) throw new RuntimeException("Файл пустой");

            String[] header = headerLine.split(";");

            ArrayList<int[]> dataList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                int[] row = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    row[i] = Integer.parseInt(parts[i]);
                }
                dataList.add(row);
            }

            int[][] data = dataList.toArray(new int[0][]);
            return new AppData(header, data);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number conversion error: " + e.getMessage());
        }
        return null;
    }
}
