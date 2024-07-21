package com.example.demo_back.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
