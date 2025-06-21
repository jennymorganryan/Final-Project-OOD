import Problem2.Band;
import Problem2.RecordingArtist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BandTest {

    private RecordingArtist sol;
    private RecordingArtist sky;
    private Band healingCollective;
    private Band duplicateBand;

    @BeforeEach
    void setUp() {
        sol = new RecordingArtist("Sol", "Flower");
        sky = new RecordingArtist("Sky", "River");
        healingCollective = new Band(Arrays.asList(sol, sky));
        duplicateBand = new Band(Arrays.asList(sol, sky));
    }

    @Test
    void testBandMembers() {
        assertEquals(2, healingCollective.getMembers().size());
        assertTrue(healingCollective.getMembers().contains(sky));
    }

    @Test
    void testBandEquality() {
        assertEquals(healingCollective, duplicateBand);
        assertEquals(healingCollective.hashCode(), duplicateBand.hashCode());
    }
}
