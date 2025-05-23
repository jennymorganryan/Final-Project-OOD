package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private Credentials creds;
    private User user;

    @BeforeEach
    void setUp() {
        creds = new Credentials("Million", "12345");
        user = new User(creds, "Jenny", "Morgan", "6146336994", "jenny@gmail.com");
    }

    @Test
    void userCheck() {
        assertEquals("Million", user.getCredentials().getUsername());
        assertEquals("12345", user.getCredentials().getPasswordHash());
        assertEquals("6146336994", user.getPhoneNumber());
        assertEquals("jenny@gmail.com", user.getEmail());
        assertEquals("Jenny", user.getFirstName());
        assertEquals("Morgan", user.getLastName());

    }

    @Test
    void phoneNumberCheck() {
        user.setPhoneNumber("1239");
        assertEquals("Invalid", user.getPhoneNumber());
    }

}