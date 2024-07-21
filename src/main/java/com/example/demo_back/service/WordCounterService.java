package com.example.demo_back.service;


import org.springframework.stereotype.Service;

@Service
public class WordCounterService {

    public int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] lines = input.split("\\n");
        int wordCount = 0;

        for (String line : lines) {
            String sanitizedLine = line.replaceAll("[^a-zA-Z0-9\\s]", " ");
            String[] words = sanitizedLine.split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCount++;
                }
            }
        }

        return wordCount;
    }
}

