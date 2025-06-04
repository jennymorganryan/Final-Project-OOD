import Problem1.DinnerEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DinnerEventTest {
    private DinnerEvent dinner;

    @BeforeEach
    void setUp() {
        dinner = new DinnerEvent(50, "Morgan", LocalDate.of(2025, 5, 29), 1000.0);
    }
    @Test
    public void testDinnerEventQuantities() {
        assertEquals(40, dinner.getNonVegEntrees());
        assertEquals(10, dinner.getVegEntrees());
        assertEquals(5, dinner.getVeganEntrees());
    }
    @Test
    public void testInvalidDinnerAttendees() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DinnerEvent(100, "Dana", LocalDate.now(), 1500.0);
        });
    }
}