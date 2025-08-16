import Option1.SkierData;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SkierDataTest {

    private SkierData skier;

    @BeforeEach
    void setup() {
        skier = new SkierData();
    }

    @Test
    void addRideAccumulates() {
        assertEquals(0, skier.getRides());
        assertEquals(0, skier.getVertical());

        skier.addRide(200);
        skier.addRide(500);

        assertEquals(2, skier.getRides());
        assertEquals(700, skier.getVertical());
    }
}