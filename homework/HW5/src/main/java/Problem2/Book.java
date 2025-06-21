package Problem2;

import java.util.Objects;

/**
 * The type Book.
 */
public class Book extends AbstractLibraryItem {
    private Author author;

    /**
     * Instantiates a new Book.
     *
     * @param title                   the title
     * @param yearReleasedOrPublished the year released or published
     * @param author                  the author
     */
    public Book(String title, int yearReleasedOrPublished, Author author) {
        super(title, yearReleasedOrPublished);
        this.author = author;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);
    }
}
