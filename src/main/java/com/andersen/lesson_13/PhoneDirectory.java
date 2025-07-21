package com.andersen.lesson_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private final Map<String, List<String>> directory = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<>());
    }

    public void printTestData() {
        add("Smith", "123-456");
        add("Smith", "987-654");
        add("Johnson", "555-555");
        add("Brown", "777-777");

        System.out.println("Numbers for Smith: " + get("Smith"));
        System.out.println("Numbers for Johnson: " + get("Johnson"));
        System.out.println("Numbers for Brown: " + get("Brown"));
        System.out.println("Numbers for Davis: " + get("Davis"));
    }
}
