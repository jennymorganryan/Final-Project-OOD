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
    void getDegree() throws ZeroException {
            assertEquals(7, polynomial.getDegree());
    }

    @Test
    void getCoefficient() throws ZeroException {
            assertEquals(5, polynomial.getCoefficient(7));
            assertEquals(8, polynomial.getCoefficient(2));
            assertEquals(0, polynomial.getCoefficient(4));
    }

    @Test
    void addTerm() throws ZeroException {
            polynomial.addTerm(3, 'z', 4);
            assertEquals(3, polynomial.getCoefficient(4));

            polynomial.addTerm(2, 'x', 2);
            assertEquals(10, polynomial.getCoefficient(2));

    }

    @Test
    void removeTerm() throws ZeroException {
        polynomial.removeTerm(7);
            assertEquals(0, polynomial.getCoefficient(7));

    }

    @Test
    void add() throws ZeroException {
            Polynomial other = new Polynomial();
            other.addTerm(5, 'x', 2);
            other.addTerm(4, 'z', 3);

            Polynomial result = polynomial.add(other);

            assertEquals(13, result.getCoefficient(2));
            assertEquals(5, result.getCoefficient(7));
            assertEquals(4, result.getCoefficient(3));

    }

    @Test
    void printPolynomial() {
        String result = polynomial.printPolynomial();
        assertTrue(result instanceof String);
    }
}