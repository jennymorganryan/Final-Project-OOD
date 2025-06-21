package Problem2;

/**
 * The type Recording artist.
 */
public class RecordingArtist extends AbstractIndividualCreator {
    /**
     * Instantiates a new Recording artist.
     *
     * @param firstName the first name as a string
     * @param lastName  the last name as a string
     */
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