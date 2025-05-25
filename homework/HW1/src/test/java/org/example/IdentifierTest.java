package org.example;

import Problem3.Identifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Identifier test.
 */
class IdentifierTest {

    private Identifier id;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        id = new Identifier("jenny123", 2025, "USA");
    }

    /**
     * Gets username.
     */
    @Test
    void getUsername() {
        assertEquals("jenny123", id.getUsername());
    }

    /**
     * Gets year created.
     */
    @Test
    void getYearCreated() {
        assertEquals(2025, id.getYearCreated());
    }

    /**
     * Gets country.
     */
    @Test
    void getCountry() {
        assertEquals("USA", id.getCountry());
    }
}
