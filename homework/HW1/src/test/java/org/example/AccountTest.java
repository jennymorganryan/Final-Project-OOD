package org.example;

import Problem3.Account;
import Problem3.Amount;
import Problem3.Identifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Account test.
 */
class AccountTest {

    private Account account;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        Identifier id = new Identifier("user001", 2024, "USA");
        Amount balance = new Amount(5, 50); // $5.50
        account = new Account(id, balance);
    }

    /**
     * Deposit.
     */
    @Test
    void deposit() {
        Amount deposit = new Amount(2, 75); // $2.75
        Account updated = account.deposit(deposit);
        assertEquals(825, updated.getBalance().toTotalCents()); // $8.25
    }

    /**
     * Withdraw.
     */
    @Test
    void withdraw() {
        Amount withdraw = new Amount(1, 25); // $1.25
        Account updated = account.withdraw(withdraw);
        assertEquals(425, updated.getBalance().toTotalCents()); // $4.25
    }

    /**
     * Convert.
     */
    @Test
    void convert() {
        Amount sample = new Amount(4, 0); // $4.00
        double btc = account.convert(sample);
        assertEquals(0.0001, btc, 0.000001);
    }
}
