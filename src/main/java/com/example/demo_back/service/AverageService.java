package com.example.demo_back.service;


import org.springframework.stereotype.Service;

@Service
public class AverageService {

    public double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }
}

