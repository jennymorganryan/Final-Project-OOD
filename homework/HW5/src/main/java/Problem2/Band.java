package Problem2;

import java.util.List;
import java.util.Objects;

/**
 * The type Band.
 */
public class Band extends AbstractCreator {

    protected List<RecordingArtist> members;

    /**
     * Instantiates a new Band.
     *
     * @param members the members as a list
     */
    public Band(List<RecordingArtist> members) {
        this.members = members;
    }

    /**
     * Gets members.
     *
     * @return the members
     */
    public List<RecordingArtist> getMembers() {
        return members;
    }

    /**
     * Sets members.
     *
     * @param members the members
     */
    public void setMembers(List<RecordingArtist> members) {
        this.members = members;
    }

    @Override
    public String getName() {
        return this.members.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Band band)) return false;
        return Objects.equals(members, band.members);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(members);
    }
}
