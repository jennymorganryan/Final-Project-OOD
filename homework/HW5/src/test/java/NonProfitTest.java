import Problem1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class NonProfitTest {
    private NonProfit nonProfit;

    @BeforeEach
    void setUp() {
        List<DonationCreation> donations = new ArrayList<>();
        donations.add(new OneTimeDonation(100, LocalDate.of(2024, 5, 12), LocalTime.of(12, 0)));
        donations.add(new OneTimeDonation(200, LocalDate.of(2025, 6, 10), LocalTime.of(12, 0)));

        DonationDate pledgeDate2024 = new DonationDate(LocalDate.of(2024, 7, 20), LocalTime.of(12, 0));
        donations.add(new Pledges(300, LocalDate.of(2024, 1, 1), LocalTime.of(12, 0), pledgeDate2024));

        nonProfit = new NonProfit(donations, "Peta org.");
    }

    @Test
    void testGetTotalDonationsForYear() {
        assertEquals(400, nonProfit.getTotalDonationsForYear(2024)); // 100 + 300
        assertEquals(200, nonProfit.getTotalDonationsForYear(2025));
        assertEquals(0, nonProfit.getTotalDonationsForYear(2023));
    }
}