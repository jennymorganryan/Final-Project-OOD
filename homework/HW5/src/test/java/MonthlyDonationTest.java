import Problem1.MonthlyDonation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MonthlyDonationTest {
    private MonthlyDonation monthlydonationtest;
    private MonthlyDonation fullYearDonation;
    private MonthlyDonation partialYearDonation;
    private MonthlyDonation cancelledInYearDonation;
    private MonthlyDonation cancelledOutsideYearDonation;

    @BeforeEach
    void setUp() {
        monthlydonationtest = new MonthlyDonation(55, LocalDate.of(2025, 05, 12), LocalTime.now());
        fullYearDonation = new MonthlyDonation(100, LocalDate.of(2023, 1, 1), LocalTime.of(10, 0));

        partialYearDonation = new MonthlyDonation(100, LocalDate.of(2023, 7, 1), LocalTime.of(10, 0));

        cancelledInYearDonation = new MonthlyDonation(100, LocalDate.of(2023, 3, 1), LocalTime.of(10, 0));
        cancelledInYearDonation.setCancellationDate(LocalDate.of(2023, 8, 1));

        cancelledOutsideYearDonation = new MonthlyDonation(100, LocalDate.of(2022, 10, 1), LocalTime.of(10, 0));
        cancelledOutsideYearDonation.setCancellationDate(LocalDate.of(2024, 2, 1));

    }

    @Test
    void setCancellationDate() {
        LocalDate date = LocalDate.of(2025, 5, 12);
        monthlydonationtest.setCancellationDate(date);
        assertEquals(date, monthlydonationtest.getCancellationDate());
    }

    @Test
    void getTotalForYear() {
        assertEquals(1200, fullYearDonation.getTotalForYear(2023), "Full year, no cancellation");
        assertEquals(600, partialYearDonation.getTotalForYear(2023), "Starts mid-year, no cancellation");
        assertEquals(600, cancelledInYearDonation.getTotalForYear(2023), "Cancelled August 2023");
        assertEquals(1200, cancelledOutsideYearDonation.getTotalForYear(2023), "Cancelled after 2023");
    }
}