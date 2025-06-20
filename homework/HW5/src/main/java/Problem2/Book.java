package Problem2;

import java.util.Objects;

public class Book extends AbstractLibraryItem {
    private Author author;

    public Book(String title, int yearReleasedOrPublished, Author author) {
        super(title, yearReleasedOrPublished);
        this.author = author;
    }

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
