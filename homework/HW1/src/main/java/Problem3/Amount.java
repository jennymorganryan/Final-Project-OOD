package org.example.Problem3;

/**
 * The type Amount.
 */
public class Amount {
    private Integer dollars;
    private Integer cents;

    /**
     * Instantiates a new Amount.
     *
     * @param cents   the cents
     * @param dollars the dollars
     */
    public Amount(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    /**
     * Gets dollars.
     *
     * @return the dollars
     */
    public int getDollars() {
        return dollars;
    }

    /**
     * Gets cents.
     *
     * @return the cents
     */
    public int getCents() {
        return cents;
    }

    /**
     * Converts the amount to total cents.
     *
     * @return the int
     */
    public int toTotalCents() {
        return dollars * 100 + cents;
    }

    /**
     * Converts this amount to a USD double.
     *
     * @return the double
     */
    public double toUSD() {
        return dollars + cents / 100.0;
    }

    /**
     * From total cents amount.
     *
     * @param totalCents the total cents
     * @return the amount
     */
    public static Amount fromTotalCents(int totalCents) {
        int newDollars = totalCents / 100;
        int newCents = totalCents % 100;
        return new Amount(newDollars, newCents);
    }



}
