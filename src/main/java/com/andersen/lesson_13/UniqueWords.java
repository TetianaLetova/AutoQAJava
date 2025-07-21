package com.andersen.lesson_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void processWords() {
        String[] words = {
                "apple", "banana", "apple", "orange", "banana",
                "grape", "kiwi", "apple", "kiwi", "melon",
                "grape", "plum", "apple", "pear", "pear"
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Unique words: " + uniqueWords);
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}