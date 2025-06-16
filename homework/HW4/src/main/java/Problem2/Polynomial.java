package Problem2;
import Problem2.TermNode;

import java.util.Objects;

/**
 * The type Polynomial which implements PolynomialInterface interface
 */
public class Polynomial implements PolynomialInterface {
    private static final String NOT_FOUND = "Coefficient not found"; ;

    protected TermNode head;

    /**
     * Instantiates a new Polynomial.
     */
    public Polynomial() {
        this.head = null;
    }

    /**
     * Gets the degree of the polynomial
     *
     * @return the highest degree
     * @throws ZeroException if polynomial is empty
     */

    @Override
    public int getDegree() throws ZeroException {
        if (this.head == null) {
            throw new ZeroException("Degree must not be null or 0");
        }
        return this.head.degree;
    }
    /**
     * Gets the coefficient for the given power
     *
     * @param power the power to look for
     * @return the coefficient if found, else 0
     * @throws ZeroException ignored in this implementation
     */

    @Override
    public int getCoefficient(int power) throws ZeroException {
        TermNode currNode = this.head;

        while (currNode != null) {
            if (currNode.degree == power) {
                return currNode.coefficient;
            }
            currNode = currNode.next;
        }
        return 0;
    }

    /**
     * Adds a term to the polynomial
     *
     * @param coefficient the coefficient
     * @param variable    the variable (e.g. x)
     * @param degree      the degree
     * @throws ZeroException if coefficient is 0
     */

    @Override
    public void addTerm(int coefficient, char variable,  int degree) throws ZeroException {
        if (coefficient == 0) {
            throw new ZeroException("Coefficient cannot be 0");
        }

        TermNode newNode = new TermNode(coefficient, variable, degree, null);

        //empty list
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        TermNode current = this.head;
        TermNode prev = null;

        // find the correct insertion point
        while (current != null && current.degree > degree) {
            prev = current;
            current = current.next;
        }

        // combine coefficients if same coeffficients exist
        if (current != null && current.degree == degree) {
            current.coefficient += coefficient;

            if (current.coefficient == 0) {
                if (prev == null) {
                    this.head = current.next;
                } else {
                    prev.next = current.next;
                }
            }
            return;
        }

        newNode.next = current;

        if (prev == null) {
            this.head = newNode;
        } else {
            prev.next = newNode;
        }
    }

    /**
     * Removes the term with the given power
     *
     * @param power the degree of the term to remove
     */

    @Override
        public void removeTerm(int power) {
            TermNode currNode = this.head;
            TermNode prevNode = null;

            while (currNode != null) {
                if (currNode.degree == power) {
                    if (prevNode == null) {
                        this.head = currNode.next;
                    } else {
                        prevNode.next = currNode.next;
                    }
                    return;
                }
                prevNode = currNode;
                currNode = currNode.next;
            }
    }

    /**
     * Adds this polynomial with another polynomial
     *
     * @param other the other polynomial
     * @return the result of the addition
     * @throws ZeroException if coefficient is 0
     */

    @Override
    public Polynomial add(Polynomial other) throws ZeroException {
        Polynomial result = new Polynomial();

        TermNode currNode = this.head;
        while (currNode != null) {
            result.addTerm(currNode.coefficient, currNode.variable, currNode.degree);
            currNode = currNode.next;
        }

        TermNode otherNode = other.head;
        while (otherNode != null) {
            result.addTerm(otherNode.coefficient, otherNode.variable, otherNode.degree);
            otherNode = otherNode.next;
        }

        return result;
    }

    /**
     * Prints the polynomial as a string
     *
     * @return the polynomial in string format
     */

    @Override
    public String printPolynomial() {
        return this.head.toString();
    }

    /**
     * Gets head.
     *
     * @return the head
     */
    public TermNode getHead() {
        return head;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(head);
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "head=" + head +
                '}';
    }
}
