package com.example.demo_back.service;

import org.springframework.stereotype.Service;

@Service
public class LeapYearService {

    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
