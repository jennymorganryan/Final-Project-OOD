package Problem2;

import java.util.Objects;

/**
 * The type Recipient.
 */
public class Recipient extends Mail {
    private String firstName;
    private String lastName;
    private String address;

    /**
     * Instantiates a new Recipient.
     *
     * @param address   the address
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Recipient(String address, String firstName, String lastName) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Recipient recipient = (Recipient) o;
        return Objects.equals(firstName, recipient.firstName) && Objects.equals(lastName, recipient.lastName) && Objects.equals(address, recipient.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address);
    }

    @Override
    public String toString() {
        return "Recipient{" +
                "address='" + address + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
