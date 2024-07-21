package com.example.demo_back.controller;

import com.example.demo_back.service.LeapYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapYearController {

    @Autowired
    private LeapYearService leapYearService;

    @GetMapping("/isLeapYear")
    public boolean isLeapYear(@RequestParam int year) {
        return leapYearService.isLeapYear(year);
    }
}
