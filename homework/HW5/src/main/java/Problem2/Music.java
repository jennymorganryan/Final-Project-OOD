package Problem2;

import java.util.Objects;

public class Music extends AbstractLibraryItem {
    private AbstractCreator recordingArtist;

    public Music(String title, int yearReleasedOrPublished, AbstractCreator recordingArtist) {
        super(title, yearReleasedOrPublished);
        this.recordingArtist = recordingArtist;
    }

    public AbstractCreator getCreator() {
        return recordingArtist;
    }

    public AbstractCreator getRecordingArtist() {
        return recordingArtist;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Music music)) return false;
        return Objects.equals(recordingArtist, music.recordingArtist);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(recordingArtist);
    }

    @Override
    public String toString() {
        return "Music{" +
                "recordingArtist=" + recordingArtist +
                ", title='" + title + '\'' +
                ", yearReleasedOrPublished=" + yearReleasedOrPublished +
                '}';
    }
}