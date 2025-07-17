package com.andersen.lesson_12;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public void save(String filePath, AppData appData) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(String.join(";", appData.getHeader()));
            writer.write("\n");

            for (int[] row : appData.getData()) {
                for (int i = 0; i < row.length; i++) {
                    writer.write(Integer.toString(row[i]));
                    if (i < row.length - 1) {
                        writer.write(";");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
