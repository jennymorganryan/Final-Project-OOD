import Problem2.Polynomial;
import Problem2.ZeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {
    Polynomial polynomial;
    @BeforeEach
    void setUp() throws ZeroException {
        polynomial = new Polynomial();
        polynomial.addTerm(8, 'x', 2);
        polynomial.addTerm(5, 'y', 7);
    }

    @Test
    void getDegree() {
        try {
            assertEquals(7, polynomial.getDegree());
        } catch (ZeroException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void getCoefficient() {
        try {
            assertEquals(5, polynomial.getCoefficient(7));
            assertEquals(8, polynomial.getCoefficient(2));
            assertEquals(0, polynomial.getCoefficient(4));
        } catch (ZeroException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void addTerm() {
        try {
            polynomial.addTerm(3, 'z', 4);
            assertEquals(3, polynomial.getCoefficient(4));

            polynomial.addTerm(2, 'x', 2);
            assertEquals(10, polynomial.getCoefficient(2));
        } catch (ZeroException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void removeTerm() {
        polynomial.removeTerm(7);
        try {
            assertEquals(0, polynomial.getCoefficient(7));
        } catch (ZeroException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void add() {
        try {
            Polynomial other = new Polynomial();
            other.addTerm(5, 'x', 2);  // combines with 8x^2 → 13x^2
            other.addTerm(4, 'z', 3);  // new term

            Polynomial result = polynomial.add(other);

            assertEquals(13, result.getCoefficient(2));
            assertEquals(5, result.getCoefficient(7));
            assertEquals(4, result.getCoefficient(3));
        } catch (ZeroException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void printPolynomial() {
        String result = polynomial.printPolynomial();
        assertTrue(result instanceof String);
    }
}