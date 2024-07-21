package com.example.demo_back.service;

public class StringVerificationService {
    public String getAcronym(String text) {
        // Méthode pour obtenir un acronyme
        // Exemple simple pour illustrer
        return text.replaceAll(" ", "").toUpperCase();
    }

    public boolean containsSubstring(String text, String substring) {
        // Méthode pour vérifier si une chaîne contient un sous-texte
        return text.contains(substring);
    }
}
