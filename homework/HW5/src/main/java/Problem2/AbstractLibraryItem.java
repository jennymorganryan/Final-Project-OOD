package Problem2;

public abstract class AbstractLibraryItem {
    protected String title;
    protected int yearReleasedOrPublished;

    public AbstractLibraryItem(String title, int yearReleasedOrPublished) {
        this.title = title;
        this.yearReleasedOrPublished = yearReleasedOrPublished;
    }

    public String getTitle() {
        return title;
    }

    public int getYearReleasedOrPublished() {
        return yearReleasedOrPublished;
    }

}
