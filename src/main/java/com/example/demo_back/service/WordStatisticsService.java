package com.example.demo_back.service;


import org.springframework.stereotype.Service;

@Service
public class WordStatisticsService {

    public double getAverageWordLength(String sentence) {
        String[] words = sentence.split(" ");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return Math.round((double) totalLength / words.length);
    }
}

