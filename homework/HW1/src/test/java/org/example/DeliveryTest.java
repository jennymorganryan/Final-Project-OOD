package org.example;

import Problem2.Delivery;
import Problem2.Time;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryTest {
    private Delivery delivery;

    @BeforeEach
    void setUp() {
        Time start = Time.fromSeconds(3600);   // 01:00:00
        Time end = Time.fromSeconds(7265);     // 02:01:05
        delivery = new Delivery("Seattle", "Boston", start, end);
    }
    @Test
    void testGetStartLocation() {
        assertEquals("Seattle", delivery.getStartLocation());
    }

    @Test
    void testGetEndLocation() {
        assertEquals("Boston", delivery.getEndLocation());
    }

    @Test
    void testSetStartLocation() {
        delivery.setStartLocation("Houston");
        assertEquals("Houston", delivery.getStartLocation());
    }

    @Test
    void testSetEndLocation() {
        delivery.setEndLocation("New York");
        assertEquals("New York", delivery.getEndLocation());
    }

    @Test
    void testGetStartTime() {
        assertEquals(1, delivery.getStartTime().getHour());
    }

    @Test
    void testGetEndTime() {
        assertEquals(2, delivery.getEndTime().getHour());
        assertEquals(1, delivery.getEndTime().getMinute());
        assertEquals(5, delivery.getEndTime().getSecond());
    }

    @Test
    void testGetDuration() {
        Time duration = delivery.getDuration(); // 01:01:05
        assertEquals(1, duration.getHour());
        assertEquals(1, duration.getMinute());
        assertEquals(5, duration.getSecond());
    }

    @Test
    void testSetStartTime() {
        Time newStart = Time.fromSeconds(0); // 00:00:00
        delivery.setStartTime(newStart);
        assertEquals(0, delivery.getStartTime().getHour());
    }

    @Test
    void testSetEndTime() {
        Time newEnd = Time.fromSeconds(3600); // 01:00:00
        delivery.setEndTime(newEnd);
        assertEquals(1, delivery.getEndTime().getHour());
    }
}
