package Problem1;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The type One time donation.
 */
public class OneTimeDonation extends DonationCreation {
    /**
     * Instantiates a new One time donation.
     *
     * @param amount      the amount as an int
     * @param dateCreated the date created as a local date
     * @param timeCreated the time created as a local time
     */
    public OneTimeDonation(int amount, LocalDate dateCreated, LocalTime timeCreated) {
        super(amount, dateCreated, timeCreated);
    }

    @Override
    public int getTotalForYear(int year) {
        return dateCreated.getYear() == year ? amount : 0;
    }
}