import Problem2.Author;
import Problem2.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    private Author audre;
    private Book book;

    @BeforeEach
    void setUp() {
        audre = new Author("Audre", "Lorde");
        book = new Book("Sister Outsider", 1984, audre);
    }

    @Test
    void testBookCreation() {
        assertEquals("Sister Outsider", book.getTitle());
        assertEquals(1984, book.getYearReleasedOrPublished());
        assertEquals(audre, book.getAuthor());
    }
}
