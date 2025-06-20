package Problem2;

public class Author extends AbstractIndividualCreator {
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
