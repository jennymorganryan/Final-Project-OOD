package Problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Catalog.
 */
public class Catalog {

    protected List<AbstractLibraryItem> items;

    /**
     * Instantiates a new Catalog.
     *
     * @param items the items
     */
    public Catalog(List<AbstractLibraryItem> items) {
        this.items = items;
    }

    /**
     * Add item.
     *
     * @param item the item
     */
    public void addItem(AbstractLibraryItem item) {
        items.add(item);
    }

    /**
     * Remove item.
     *
     * @param item the item
     */
    public void removeItem(AbstractLibraryItem item) {
        items.remove(item);
    }

    /**
     * Search list.
     *
     * @param keyword the keyword
     * @return the list
     */
    public List<AbstractLibraryItem> search(String keyword) {
        List<AbstractLibraryItem> result = new ArrayList<>();
        for (AbstractLibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Search list.
     *
     * @param author the author
     * @return the list
     */
    public List<AbstractLibraryItem> search(Author author) {
        List<AbstractLibraryItem> result = new ArrayList<>();
        for (AbstractLibraryItem item : items) {
            if (item instanceof Book book && book.getAuthor().equals(author)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Search list.
     *
     * @param artist the artist
     * @return the list
     */
    public List<AbstractLibraryItem> search(RecordingArtist artist) {
        List<AbstractLibraryItem> result = new ArrayList<>();
        for (AbstractLibraryItem item : items) {
            if (item instanceof Music music) {
                AbstractCreator creator = music.getRecordingArtist();

                if (creator instanceof RecordingArtist && creator.equals(artist)) {
                    result.add(item);
                } else if (creator instanceof Band band && band.getMembers().contains(artist)) {
                    result.add(item);
                }
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Catalog catalog)) return false;
        return Objects.equals(items, catalog.items);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(items);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "items=" + items +
                '}';
    }
}