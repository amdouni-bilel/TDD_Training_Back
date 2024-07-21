package com.example.demo_back.controller;


import com.example.demo_back.service.WordCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/words")
public class WordCounterController {

    @Autowired
    private WordCounterService wordCounterService;

    @PostMapping("/count")
    public int countWords(@RequestBody String text) {
        return wordCounterService.countWords(text);
    }
}

