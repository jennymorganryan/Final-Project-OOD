import Problem1.DonationDate;
import Problem1.Pledges;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PledgesTest {
    private Pledges pledge2024;
    private Pledges pledge2025;

    @BeforeEach
    void setUp() {
        DonationDate date2024 = new DonationDate(LocalDate.of(2024, 6, 10), LocalTime.NOON);
        DonationDate date2025 = new DonationDate(LocalDate.of(2025, 6, 10), LocalTime.NOON);

        pledge2024 = new Pledges(150, LocalDate.of(2023, 12, 1), LocalTime.NOON, date2024);
        pledge2025 = new Pledges(250, LocalDate.of(2024, 1, 1), LocalTime.NOON, date2025);
    }

    @Test
    void testGetTotalForYear() {
        assertEquals(150, pledge2024.getTotalForYear(2024));
        assertEquals(250, pledge2025.getTotalForYear(2025));
        assertEquals(0, pledge2024.getTotalForYear(2025));
    }
}