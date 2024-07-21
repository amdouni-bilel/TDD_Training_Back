package com.example.demo_back.service;


import org.springframework.stereotype.Service;

@Service
public class PasswordValidatorService {

    public boolean isValidPassword(String password) {
        if (password == null || password.isEmpty()) return false;
        if (password.length() < 8) return false;
        if (!password.matches(".*\\d.*")) return false; // Doit contenir au moins un chiffre
        // Ajouter d'autres validations ici si nécessaire
        return true;
    }
}

