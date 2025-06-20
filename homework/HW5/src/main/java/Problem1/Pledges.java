package Problem1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 * The type Pledges.
 */
public class Pledges extends DonationCreation {

    protected DonationDate processingDate;

    /**
     * Instantiates a new Pledges.
     *
     * @param amount         the amount
     * @param dateCreated    the date created
     * @param timeCreated    the time created
     * @param processingDate the processing date
     */
    public Pledges(int amount, LocalDate dateCreated, LocalTime timeCreated, DonationDate processingDate) {
        super(amount, dateCreated, timeCreated);
        this.processingDate = processingDate;
    }

    /**
     * Gets processing date.
     *
     * @return the processing date
     */
    public DonationDate getProcessingDate() {
        return processingDate;
    }


    @Override
    public int getTotalForYear(int year) {
        if (this.processingDate != null && this.processingDate.getDateDonated().getYear() == year) {
            return this.amount;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pledges pledges = (Pledges) o;
        return Objects.equals(processingDate, pledges.processingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(processingDate);
    }

    @Override
    public String toString() {
        return "Pledges{" +
                "processingDate=" + processingDate +
                ", amount=" + amount +
                ", dateCreated=" + dateCreated +
                ", timeCreated=" + timeCreated +
                '}';
    }
}
