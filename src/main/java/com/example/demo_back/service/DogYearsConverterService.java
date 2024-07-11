package com.example.demo_back.service;

import org.springframework.stereotype.Service;

@Service
public class DogYearsConverterService {

    public int convertToHumanYears(int dogYears) {
        return dogYears * 7;
    }
}
