package Problem2;

import java.util.Objects;

public class AbstractIndividualCreator extends AbstractCreator{
    protected String firstName;
    protected String lastName;
    protected String fullName;


    public AbstractIndividualCreator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;

    }

    public String getFirstName() {
        return firstName;
    }

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
