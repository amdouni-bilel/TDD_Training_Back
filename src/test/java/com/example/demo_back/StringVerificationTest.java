package com.example.demo_back;
import com.example.demo_back.service.StringVerificationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
public class StringVerificationTest {

    @Autowired
    private StringVerificationService stringService;

    @Test
    public void testGetAcronym() {
        // Test pour vérifier que l'acronyme est correctement généré
        String result = stringService.getAcronym("test driven development");
        assertThat(result).isEqualTo("TDD");
    }

    @Test
    public void testGetAcronymLength() {
        // Test pour vérifier la longueur de l'acronyme
        String result = stringService.getAcronym("test driven development");
        assertThat(result).hasSize(3); // Vérifie que la taille est de 3 caractères
    }

    @Test
    public void testContainsSubstring() {
        // Test pour vérifier si la chaîne contient un sous-texte
        boolean result = stringService.containsSubstring("test driven development", "driven");
        assertThat(result).isTrue(); // Vérifie que la chaîne contient "driven"
    }

    @Test
    public void testContainsSubstringWithSubstringNotPresent() {
        // Test pour vérifier si la chaîne ne contient pas un sous-texte
        boolean result = stringService.containsSubstring("test driven development", "invalid");
        assertThat(result).isFalse(); // Vérifie que la chaîne ne contient pas "invalid"
    }
}
