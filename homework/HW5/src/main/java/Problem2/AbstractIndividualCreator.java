package Problem2;

import java.util.Objects;

/**
 * The type Abstract individual creator.
 */
public class AbstractIndividualCreator extends AbstractCreator{

    protected String firstName;
    protected String lastName;
    protected String fullName;


    /**
     * Instantiates a new Abstract individual creator.
     *
     * @param firstName the first name as a string
     * @param lastName  the last name as a string
     */
    public AbstractIndividualCreator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;

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
    public String getName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AbstractIndividualCreator that)) return false;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fullName);
    }
}
