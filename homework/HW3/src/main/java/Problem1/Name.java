package Problem1;

/**
 * The type Problem1.Name.
 */
public class Name {
    private String firstName;
    private String lastName;

    /**
     * Instantiates a new Problem1.Name.
     *
     * @param firstName the first name as a String
     * @param lastName  the last name as a String
     */
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
