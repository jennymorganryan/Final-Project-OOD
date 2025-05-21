import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

Author testAuthor;

class AuthorTest {

    @BeforeEach
    void setUp() {
        testAuthor = new Author("Jane Austin", "Jane Austin", "London, UK")
    }

    @Test
    void getName() {
        assertEquals("John Doe", testAuthor.getName());
    }

    @Test
    void getEmail() {
        assertNotEquals(Boolean.parseBoolean("no email"), testAuthor.getEmail())
    }

    @Test
    void getAddress() {
    }

    @Test
    void testToString() {
    }
}