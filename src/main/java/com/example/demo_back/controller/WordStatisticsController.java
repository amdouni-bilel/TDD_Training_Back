package com.example.demo_back.controller;


import com.example.demo_back.service.WordStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordStatisticsController {

    @Autowired
    private WordStatisticsService wordStatisticsService;

    @GetMapping("/average-word-length")
    public double getAverageWordLength(@RequestParam String sentence) {
        return wordStatisticsService.getAverageWordLength(sentence);
    }
}

