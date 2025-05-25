package org.example.Problem3;

/**
 * The type Account.
 */
public class Account {
    private Identifier identifier;
    private Amount balance;


    /**
     * Instantiates a new Account.
     *
     * @param identifier the identifier
     * @param balance    the balance
     */
    public Account(Identifier identifier, Amount balance) {
        this.identifier = identifier;
        this.balance = balance;
    }

    /**
     * Deposit account.
     *
     * @param deposit the deposit
     * @return the account
     */
    public Account deposit(Amount deposit) {
        int totalCents = balance.toTotalCents() + deposit.toTotalCents();
        return new Account(identifier, Amount.fromTotalCents(totalCents));
    }


    /**
     * Withdraw account.
     *
     * @param withdraw the withdraw
     * @return the account
     */
    public Account withdraw(Amount withdraw) {
        int remainingCents = balance.toTotalCents() - withdraw.toTotalCents();
        return new Account(identifier, Amount.fromTotalCents(remainingCents));
    }


    /**
     * Convert double.
     *
     * @param amount the amount
     * @return the double
     */
    public double convert(Amount amount) {
        return amount.toUSD() * 0.000025;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Identifier getId() {
        return identifier;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Amount getBalance() {
        return balance;
    }
}
