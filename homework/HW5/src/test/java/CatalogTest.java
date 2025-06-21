import Problem2.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CatalogTest {

    private Catalog catalog;

    private Author audre;
    private RecordingArtist umi;
    private RecordingArtist sol;
    private RecordingArtist sky;
    private Band healingCollective;

    private Book healingBook;
    private Music umiTrack;
    private Music bandTrack;

    @BeforeEach
    void setUp() {
        // Creators
        audre = new Author("Audre", "Lorde");
        umi = new RecordingArtist("UMI", "");
        sol = new RecordingArtist("Sol", "Flower");
        sky = new RecordingArtist("Sky", "River");
        healingCollective = new Band(Arrays.asList(sol, sky));

        // Items
        healingBook = new Book("Sister Outsider", 1984, audre);
        umiTrack = new Music("Love Affair", 2019, umi);
        bandTrack = new Music("Rooted Rhythms", 2023, healingCollective);

        // Catalog
        catalog = new Catalog(new ArrayList<>());
        catalog.addItem(healingBook);
        catalog.addItem(umiTrack);
        catalog.addItem(bandTrack);
    }

    @Test
    void testSearchByKeyword_bookTitle() {
        List<AbstractLibraryItem> result = catalog.search("Sister");
        assertEquals(1, result.size());
        assertEquals(healingBook, result.get(0));
    }

    @Test
    void testSearchByKeyword_musicTitle() {
        List<AbstractLibraryItem> result = catalog.search("Love");
        assertEquals(1, result.size());
        assertEquals(umiTrack, result.get(0));
    }

    @Test
    void testSearchByKeyword_caseInsensitive() {
        List<AbstractLibraryItem> result = catalog.search("love");
        assertEquals(1, result.size());
        assertEquals(umiTrack, result.get(0));
    }

    @Test
    void testSearchByAuthor() {
        List<AbstractLibraryItem> result = catalog.search(audre);
        assertEquals(1, result.size());
        assertEquals(healingBook, result.get(0));
    }

    @Test
    void testSearchByRecordingArtist_solo() {
        List<AbstractLibraryItem> result = catalog.search(umi);
        assertEquals(1, result.size());
        assertEquals(umiTrack, result.get(0));
    }

    @Test
    void testSearchByRecordingArtist_bandMember() {
        List<AbstractLibraryItem> result = catalog.search(sky);
        assertEquals(1, result.size());
        assertEquals(bandTrack, result.get(0));
    }

    @Test
    void testRemoveItem() {
        catalog.removeItem(umiTrack);
        List<AbstractLibraryItem> result = catalog.search(umi);
        assertTrue(result.isEmpty());
    }
}
