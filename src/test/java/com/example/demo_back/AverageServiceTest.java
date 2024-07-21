package com.example.demo_back;


import com.example.demo_back.service.AverageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AverageServiceTest {

    @Autowired
    private AverageService averageService;

    @Test
    public void testCalculateAverage() {
        // Test case 1: Empty array
        int[] numbers1 = {};
        assertEquals(0, averageService.calculateAverage(numbers1));

        // Test case 2: Single number
        int[] numbers2 = {5};
        assertEquals(5, averageService.calculateAverage(numbers2));

        // Test case 3: Multiple numbers
        int[] numbers3 = {5, 30, 8, 15, 2, 18};
        assertEquals(13, averageService.calculateAverage(numbers3));

        // Test case 4: Negative numbers
        int[] numbers4 = {-5, -10, -15};
        assertEquals(-10, averageService.calculateAverage(numbers4));

        // Test case 5: Decimal numbers (should handle integer division)
        int[] numbers5 = {1, 2, 3};
        assertEquals(2, averageService.calculateAverage(numbers5));
    }
}

