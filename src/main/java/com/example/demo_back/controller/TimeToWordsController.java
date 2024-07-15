package com.example.demo_back.controller;


import com.example.demo_back.service.TimeToWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeToWordsController {

    @Autowired
    private TimeToWordsService timeToWordsService;

    @GetMapping("/time-to-words")
    public String timeToWords(@RequestParam String time) {
        return timeToWordsService.convertTimeToWords(time);
    }
}

