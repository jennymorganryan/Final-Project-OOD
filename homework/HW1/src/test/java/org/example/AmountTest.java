package org.example;

import Problem3.Amount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Amount test.
 */
class AmountTest {

    private Amount amount;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        amount = new Amount(10, 50); // $10.50
    }

    /**
     * Gets dollars.
     */
    @Test
    void getDollars() {
        assertEquals(10, amount.getDollars());
    }

    /**
     * Gets cents.
     */
    @Test
    void getCents() {
        assertEquals(50, amount.getCents());
    }

    /**
     * To total cents.
     */
    @Test
    void toTotalCents() {
        assertEquals(1050, amount.toTotalCents());
    }

    /**
     * To usd.
     */
    @Test
    void toUSD() {
        assertEquals(10.50, amount.toUSD(), 0.0001);
    }

    /**
     * From total cents.
     */
    @Test
    void fromTotalCents() {
        Amount result = Amount.fromTotalCents(1234); // $12.34
        assertEquals(12, result.getDollars());
        assertEquals(34, result.getCents());
    }
}
