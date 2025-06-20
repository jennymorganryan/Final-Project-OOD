package Problem2;

import java.util.ArrayList;
import java.util.List;

public class Catalog extends AbstractLibraryItem {
    protected List<AbstractLibraryItem> items;

    public Catalog(String title, int yearReleasedOrPublished, List<AbstractLibraryItem> items) {
        super(title, yearReleasedOrPublished);
        this.items = items;
    }

    public void addItem(AbstractLibraryItem item) {
        items.add(item);
    }

    public void removeItem(AbstractLibraryItem item) {
        items.remove(item);
    }

    public List<AbstractLibraryItem> search(String keyword) {
        List<AbstractLibraryItem> result = new ArrayList<>();
        for (AbstractLibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }

    public List<AbstractLibraryItem> search(Author author) {
        List<AbstractLibraryItem> result = new ArrayList<>();
        for (AbstractLibraryItem item : items) {
            if (item instanceof Book book && book.getAuthor().equals(author)) {
                result.add(item);
            }
        }
        return result;
    }

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
}