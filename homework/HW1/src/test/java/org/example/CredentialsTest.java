package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CredentialsTest {
    private Credentials credentials;

    @BeforeEach
    void setUp() {
        credentials = new Credentials();
    }

    @Test
    void getUsername() {
        assert credentials.getUsername().getClass() == "String"
    }

    @Test
    void setUsername() {
    }

    @Test
    void getPasswordHash() {
    }

    @Test
    void setPasswordHash() {
    }
}