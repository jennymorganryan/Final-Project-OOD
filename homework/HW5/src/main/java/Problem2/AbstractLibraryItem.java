package Problem2;

/**
 * The type Abstract library item.
 */
public abstract class AbstractLibraryItem {

    protected String title;
    protected int yearReleasedOrPublished;

    /**
     * Instantiates a new Abstract library item.
     *
     * @param title                   the title as as a string
     * @param yearReleasedOrPublished the year released or published as a int
     */
    public AbstractLibraryItem(String title, int yearReleasedOrPublished) {
        this.title = title;
        this.yearReleasedOrPublished = yearReleasedOrPublished;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets year released or published.
     *
     * @return the year released or published
     */
    public int getYearReleasedOrPublished() {
        return yearReleasedOrPublished;
    }

}
