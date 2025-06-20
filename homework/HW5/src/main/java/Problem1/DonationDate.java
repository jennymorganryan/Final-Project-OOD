package Problem1;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The type Donation date which allows us to compare donation creation date vs donation date in Pledges class
 */
public class DonationDate {

    protected LocalDate dateDonated = LocalDate.now();
    protected LocalTime timeDonate = LocalTime.now();

    /**
     * Instantiates a new Donation date.
     *
     * @param dateDonated the date donated
     * @param timeDonate  the time donate
     */
    public DonationDate(LocalDate dateDonated, LocalTime timeDonate) {
        this.dateDonated = dateDonated;
        this.timeDonate = timeDonate;
    }

    /**
     * Gets date donated.
     *
     * @return the date donated
     */
    public LocalDate getDateDonated() {
        return dateDonated;
    }

    /**
     * Sets date donated.
     *
     * @param dateDonated the date donated
     */
    public void setDateDonated(LocalDate dateDonated) {
        this.dateDonated = dateDonated;
    }

    /**
     * Gets time donate.
     *
     * @return the time donate
     */
    public LocalTime getTimeDonate() {
        return timeDonate;
    }

    /**
     * Sets time donate.
     *
     * @param timeDonate the time donate
     */
    public void setTimeDonate(LocalTime timeDonate) {
        this.timeDonate = timeDonate;
    }
}
