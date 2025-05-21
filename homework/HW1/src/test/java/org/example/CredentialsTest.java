package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialsTest {
    private Credentials credentials;

    @BeforeEach
    void setUp() {
        credentials = new Credentials("Jenny", "Hello World");
    }

    @Test
    void getUsername() {
        //testing to see if our getusername function returns a string
        assertEquals(String.class, credentials.getUsername().getClass());
    }

    @Test
    void setUsername() {
        //testing to see if we set out username correctly
        credentials.setUsername("Jenny");
        assertEquals("Jenny", credentials.getUsername());
    }

    @Test
    void getPasswordHash() {
        //testing to see if our getter returns a string value
        assertEquals(String.class, credentials.getPasswordHash().getClass());
    }

    @Test
    void setPasswordHash() {
        //testing to see if when we set out password we saved our password correctly
        credentials.setPasswordHash("Hello World");
        assertEquals("Hello World", credentials.getPasswordHash());
    }
}