package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquirrelTest {
    @Test
    public void testGetName() {
        Squirrel s = new Squirrel("Nutty");
        assertEquals("Nutty", s.getName());
    }
}
