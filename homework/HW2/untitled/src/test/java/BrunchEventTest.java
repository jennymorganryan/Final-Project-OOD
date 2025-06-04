import Problem1.BrunchEvent;
import Problem1.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BrunchEventTest {
    private Event event;
    private LocalDate date;
    private BrunchEvent brunch;

    @BeforeEach
    void setUp() {
        date = LocalDate.of(2025, 5, 29);
        event = new Event(27, "Ryan", date, 615.00);
        brunch = new BrunchEvent(30, "Jenny", LocalDate.of(2025, 5, 29), 450.0);
    }

    @Test
    public void testBrunchEventQuantities() {
        assertEquals(20, brunch.getOmelets());
        assertEquals(51, brunch.getPancakes());
        assertEquals(45, brunch.getFruitBowls());
    }

    @Test
    void testEventInitialization() {
        assertEquals(27, event.getAttendees());
        assertEquals("Ryan", event.getCustomerName());
        assertEquals(date, event.getDate());
        assertEquals(615.00, event.getEstimatedCateringCost(), 0.01);
    }
    @Test
    public void testInvalidBrunchAttendees() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BrunchEvent(3, "Charlie", LocalDate.now(), 200.0);
        });
    }

}