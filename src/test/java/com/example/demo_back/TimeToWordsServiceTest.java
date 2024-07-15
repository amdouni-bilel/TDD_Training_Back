package com.example.demo_back;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo_back.service.TimeToWordsService;
import org.junit.jupiter.api.Test;

public class TimeToWordsServiceTest {

    private final TimeToWordsService timeToWordsService = new TimeToWordsService();

    @Test
    public void testConvertTimeToWords() {
        String result = timeToWordsService.convertTimeToWords("13:45");
        assertEquals("thirteen forty-five", result);
    }
}

