package Problem2;

import java.util.Objects;

/**
 * The type Music.
 */
public class Music extends AbstractLibraryItem {
    private AbstractCreator recordingArtist;

    /**
     * Instantiates a new Music.
     *
     * @param title                   the title as a string
     * @param yearReleasedOrPublished the year released or published as an int
     * @param recordingArtist         the recording artist as an abstract creator object
     */
    public Music(String title, int yearReleasedOrPublished, AbstractCreator recordingArtist) {
        super(title, yearReleasedOrPublished);
        this.recordingArtist = recordingArtist;
    }

    /**
     * Gets creator.
     *
     * @return the creator
     */
    public AbstractCreator getCreator() {
        return recordingArtist;
    }

    /**
     * Gets recording artist.
     *
     * @return the recording artist
     */
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