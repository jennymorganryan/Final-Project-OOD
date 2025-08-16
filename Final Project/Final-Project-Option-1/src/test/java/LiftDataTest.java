import Option1.LiftData;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LiftDataTest {

    private LiftData liftData; // created fresh before each test

    @BeforeEach
    void setup() {
        liftData = new LiftData();
    }

    @Test
    void mapsVerticalCorrectly() {
        assertEquals(200, liftData.getVerticalForLift(1));
        assertEquals(200, liftData.getVerticalForLift(20));
        assertEquals(500, liftData.getVerticalForLift(21));
        assertEquals(500, liftData.getVerticalForLift(40));
    }

    @Test
    void rejectsOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> liftData.getVerticalForLift(0));
        assertThrows(IllegalArgumentException.class, () -> liftData.getVerticalForLift(41));
    }
}