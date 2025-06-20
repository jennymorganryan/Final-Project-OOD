package Problem1;

import java.util.List;
import java.util.Objects;

/**
 * The type Non profit.
 */
public class NonProfit {

    protected String organizationName = "";
    protected List<DonationCreation> donations;


    /**
     * Instantiates a new Non profit.
     *
     * @param donations        the donations as a list of donations
     * @param organizationName the organization name as a list
     */
    public NonProfit(List<DonationCreation> donations, String organizationName) {
        this.donations = donations;
        this.organizationName = organizationName;
    }

    /**
     * Add donation.
     *
     * @param donation the donation
     */
    public void addDonation(DonationCreation donation) {
        donations.add(donation);
    }

    /**
     * Gets total donations for year.
     *
     * @param year the year
     * @return the total donations for year
     */
    public int getTotalDonationsForYear(int year) {
        int total = 0;
        for (DonationCreation donation : donations) {
            total += donation.getTotalForYear(year);
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NonProfit nonProfit = (NonProfit) o;
        return Objects.equals(organizationName, nonProfit.organizationName) && Objects.equals(donations, nonProfit.donations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationName, donations);
    }

    @Override
    public String toString() {
        return "NonProfit{" +
                "donations=" + donations +
                ", organizationName='" + organizationName + '\'' +
                '}';
    }
}
