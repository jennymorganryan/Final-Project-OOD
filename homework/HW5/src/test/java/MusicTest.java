import Problem2.Band;
import Problem2.Music;
import Problem2.RecordingArtist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MusicTest {

    private RecordingArtist umi;
    private Music umiTrack;
    private RecordingArtist r1;
    private Band band;
    private Music bandSong;

    @BeforeEach
    void setUp() {
        umi = new RecordingArtist("UMI", "");
        umiTrack = new Music("Love Affair", 2019, umi);

        r1 = new RecordingArtist("Sol", "Flower");
        band = new Band(Arrays.asList(r1));
        bandSong = new Music("Flow State", 2022, band);
    }

    @Test
    void testSoloMusic() {
        assertEquals("Love Affair", umiTrack.getTitle());
        assertEquals(2019, umiTrack.getYearReleasedOrPublished());
        assertEquals(umi, umiTrack.getRecordingArtist());
    }

    @Test
    void testBandMusic() {
        assertEquals("Flow State", bandSong.getTitle());
        assertEquals(band, bandSong.getRecordingArtist());
    }
}
