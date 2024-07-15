package com.example.demo_back.service;


import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TimeToWordsService {

    private static final Map<String, String> numbersToWords = new HashMap<>();

    static {
        numbersToWords.put("00", "zero");
        numbersToWords.put("01", "one");
        numbersToWords.put("02", "two");
        numbersToWords.put("03", "three");
        numbersToWords.put("04", "four");
        numbersToWords.put("05", "five");
        numbersToWords.put("06", "six");
        numbersToWords.put("07", "seven");
        numbersToWords.put("08", "eight");
        numbersToWords.put("09", "nine");
        numbersToWords.put("10", "ten");
        numbersToWords.put("11", "eleven");
        numbersToWords.put("12", "twelve");
        numbersToWords.put("13", "thirteen");
        numbersToWords.put("14", "fourteen");
        numbersToWords.put("15", "fifteen");
        numbersToWords.put("16", "sixteen");
        numbersToWords.put("17", "seventeen");
        numbersToWords.put("18", "eighteen");
        numbersToWords.put("19", "nineteen");
        numbersToWords.put("20", "twenty");
        numbersToWords.put("21", "twenty-one");
        numbersToWords.put("22", "twenty-two");
        numbersToWords.put("23", "twenty-three");
        numbersToWords.put("24", "twenty-four");
        numbersToWords.put("25", "twenty-five");
        numbersToWords.put("26", "twenty-six");
        numbersToWords.put("27", "twenty-seven");
        numbersToWords.put("28", "twenty-eight");
        numbersToWords.put("29", "twenty-nine");
        numbersToWords.put("30", "thirty");
        numbersToWords.put("31", "thirty-one");
        numbersToWords.put("32", "thirty-two");
        numbersToWords.put("33", "thirty-three");
        numbersToWords.put("34", "thirty-four");
        numbersToWords.put("35", "thirty-five");
        numbersToWords.put("36", "thirty-six");
        numbersToWords.put("37", "thirty-seven");
        numbersToWords.put("38", "thirty-eight");
        numbersToWords.put("39", "thirty-nine");
        numbersToWords.put("40", "forty");
        numbersToWords.put("41", "forty-one");
        numbersToWords.put("42", "forty-two");
        numbersToWords.put("43", "forty-three");
        numbersToWords.put("44", "forty-four");
        numbersToWords.put("45", "forty-five");
        numbersToWords.put("46", "forty-six");
        numbersToWords.put("47", "forty-seven");
        numbersToWords.put("48", "forty-eight");
        numbersToWords.put("49", "forty-nine");
        numbersToWords.put("50", "fifty");
        numbersToWords.put("51", "fifty-one");
        numbersToWords.put("52", "fifty-two");
        numbersToWords.put("53", "fifty-three");
        numbersToWords.put("54", "fifty-four");
        numbersToWords.put("55", "fifty-five");
        numbersToWords.put("56", "fifty-six");
        numbersToWords.put("57", "fifty-seven");
        numbersToWords.put("58", "fifty-eight");
        numbersToWords.put("59", "fifty-nine");
    }

    public String convertTimeToWords(String time) {
        String[] parts = time.split(":");
        String hoursInWords = numbersToWords.get(parts[0]);
        String minutesInWords = numbersToWords.get(parts[1]);
        return hoursInWords + " " + minutesInWords;
    }
}

