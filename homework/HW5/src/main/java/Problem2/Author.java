package Problem2;


public class Author extends AbstractIndividualCreator {
    /**
     * Instantiates a new Author.
     *
     * @param firstName the first name as a string
     * @param lastName  the last name as a string
     */
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
