import Problem2.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest {

    private Author audre;
    private Author duplicateAudre;
    private Author toni;

    @BeforeEach
    void setUp() {
        audre = new Author("Audre", "Lorde");
        duplicateAudre = new Author("Audre", "Lorde");
        toni = new Author("Toni", "Morrison");
    }

    @Test
    void testFullName() {
        assertEquals("Audre Lorde", audre.getName());
    }

    @Test
    void testEquality() {
        assertEquals(audre, duplicateAudre);
        assertEquals(audre.hashCode(), duplicateAudre.hashCode());
    }

    @Test
    void testInequality() {
        assertNotEquals(audre, toni);
    }
}
