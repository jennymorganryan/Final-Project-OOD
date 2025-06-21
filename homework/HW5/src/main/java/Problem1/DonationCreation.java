package Problem1;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The type Donation creation.
 */
public abstract class DonationCreation {

    protected int amount = 0;
    protected LocalDate dateCreated;
    protected LocalTime timeCreated;

    /**
     * Instantiates a new Donation creation.
     *
     * @param amount      the amount as an int
     * @param dateCreated the date created as a local date
     * @param timeCreated the time created as a local time
     */
    public DonationCreation(int amount, LocalDate dateCreated, LocalTime timeCreated) {
        this.amount = amount;
        this.dateCreated = dateCreated;
        this.timeCreated = timeCreated;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Gets date created.
     *
     * @return the date created
     */
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    /**
     * Gets time created.
     *
     * @return the time created
     */
    public LocalTime getTimeCreated() {
        return timeCreated;
    }

    /**
     * Gets total for year.
     *
     * @param year the year
     * @return the total for year
     */
    public abstract int getTotalForYear(int year);

}
