package com.example.demo_back;

import com.example.demo_back.entity.Name;
import com.example.demo_back.service.NameService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameServiceTest {

    @Test
    public void shouldReturnFormattedNameWithMiddleInitial() {
        Name name = new Name("Robert", "Cecil", "Martin");
        NameService nameService = new NameService();
        String formattedName = nameService.formatName(name);
        assertEquals("Robert C. Martin", formattedName);
    }
}
