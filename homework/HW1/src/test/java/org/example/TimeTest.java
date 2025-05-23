package org.example;

import Problem2.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    private Time time;

    @BeforeEach
    void setUp() {
        time = Time.fromSeconds( 3600 + 30 * 60 + 45);
    }

    @Test
    void testGetHour() {
        assertEquals(1, time.getHour());
    }

    @Test
    void testGetMinute() {
        assertEquals(30, time.getMinute());
    }

    @Test
    void testGetSecond() {
        assertEquals(45, time.getSecond());
    }

    @Test
    void testToSeconds() {
        assertEquals(5445, time.toSeconds());
    }

    @Test
    void testFromSeconds() {
        Time converted = Time.fromSeconds(3661); // 1 hour, 1 min, 1 sec
        assertEquals(1, converted.getHour());
        assertEquals(1, converted.getMinute());
        assertEquals(1, converted.getSecond());
    }

    @Test
    void testFromSecondsZero() {
        Time zeroTime = Time.fromSeconds(0);
        assertEquals(0, zeroTime.getHour());
        assertEquals(0, zeroTime.getMinute());
        assertEquals(0, zeroTime.getSecond());
    }

    @Test
    void testFromSecondsMaxValidTime() {
        Time maxTime = Time.fromSeconds(86399); //
        assertEquals(23, maxTime.getHour());
        assertEquals(59, maxTime.getMinute());
        assertEquals(59, maxTime.getSecond());
    }
}
