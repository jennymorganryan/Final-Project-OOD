package Problem1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;


/**
 * The type Monthly donation
 */
public class MonthlyDonation extends DonationCreation {

    protected boolean active = true;
    protected LocalDate cancellationDate = null;

    /**
     * Instantiates a new Monthly donation.
     *
     * @param amount      the amount as an int
     * @param dateCreated the date created as a local date
     * @param timeCreated the time created as a local time
     * @param active      the active as a boolean
     */
    public MonthlyDonation(int amount, LocalDate dateCreated, LocalTime timeCreated, boolean active) {
        super(amount, dateCreated, timeCreated);
        this.active = active;
    }

    /**
     * Sets cancellation date.
     *
     * @param cancellationDate the cancellation date
     * @return the cancellation date
     */
    public LocalDate setCancellationDate(LocalDate cancellationDate) {
        this.cancellationDate = cancellationDate;
        if (LocalDate.now().isAfter(cancellationDate) || LocalDate.now().isEqual(cancellationDate)) {
            this.active = false;
        }
        return this.cancellationDate;
    }

    @Override
    public int getTotalForYear(int year) {
        LocalDate current = dateCreated;
        LocalDate end = (cancellationDate != null) ? cancellationDate : LocalDate.of(year, 12, 31);

        int total = 0;
        while (!current.isAfter(end)) {
            if (current.getYear() == year) {
                total += amount;
            }
            current = current.plusMonths(1);
        }

        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MonthlyDonation that = (MonthlyDonation) o;
        return active == that.active && Objects.equals(cancellationDate, that.cancellationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, cancellationDate);
    }

    @Override
    public String toString() {
        return "MonthlyDonation{" +
                "active=" + active +
                ", cancellationDate=" + cancellationDate +
                ", amount=" + amount +
                ", dateCreated=" + dateCreated +
                ", timeCreated=" + timeCreated +
                '}';
    }
}
