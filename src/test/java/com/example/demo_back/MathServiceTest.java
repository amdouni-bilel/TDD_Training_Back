package com.example.demo_back;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

import com.example.demo_back.service.MathService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathServiceTest {

    @Autowired
    private MathService mathService;

    @Test
    public void shouldCalculateCircumferenceCorrectly() {
        // Given
        double radius = 10.0;
        double expectedCircumference = 2 * Math.PI * radius;

        // When
        double actualCircumference = mathService.calculateCircumference(radius);

        // Then
        assertThat(actualCircumference).isCloseTo(expectedCircumference, within(0.01)); // Tolerance de 0.01
    }
}
