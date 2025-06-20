package Problem2;

import java.util.List;
import java.util.Objects;

public class Band extends AbstractCreator {
    protected List<RecordingArtist> members;

    public Band(List<RecordingArtist> members) {
        this.members = members;
    }

    public List<RecordingArtist> getMembers() {
        return members;
    }

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
