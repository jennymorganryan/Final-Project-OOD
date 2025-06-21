import Problem1.OneTimeDonation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;


import static org.junit.jupiter.api.Assertions.*;

class OneTimeDonationTest {
    private OneTimeDonation donation2024;
    private OneTimeDonation donation2025;

    @BeforeEach
    void setUp() {
        donation2024 = new OneTimeDonation(100, LocalDate.of(2024, 5, 12), LocalTime.of(12, 0));
        donation2025 = new OneTimeDonation(200, LocalDate.of(2025, 8, 18), LocalTime.of(12, 0));
    }

    @Test
    void testGetTotalForYear() {
        assertEquals(100, donation2024.getTotalForYear(2024));
        assertEquals(200, donation2025.getTotalForYear(2025));
        assertEquals(0, donation2024.getTotalForYear(2025));
    }
}