package Problem2;

public class RecordingArtist extends AbstractIndividualCreator {
    public RecordingArtist(String firstName, String lastName) {
        super(firstName, lastName);

    }

    @Override
    public String toString() {
        return "RecordingArtist{" +
                "firstName='" + firstName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}