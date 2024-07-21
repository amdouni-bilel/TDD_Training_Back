package com.example.demo_back;


import com.example.demo_back.service.PasswordValidatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorServiceTest {

    private final PasswordValidatorService passwordValidatorService = new PasswordValidatorService();

    @Test
    void shouldRejectPasswordWhenItIsEmpty() {
        assertFalse(passwordValidatorService.isValidPassword(""));
    }

    @Test
    void shouldRejectPasswordWhenItIsTooShort() {
        assertFalse(passwordValidatorService.isValidPassword("short"));
    }

    @Test
    void shouldRejectPasswordWhenItContainsNoDigits() {
        assertFalse(passwordValidatorService.isValidPassword("NoDigitsHere"));
    }

    @Test
    void shouldAcceptValidPassword() {
        assertTrue(passwordValidatorService.isValidPassword("validPassword123"));
    }
}

