import java.time.LocalDate;

public class Schedule {
    private BrunchEvent brunch;
    private DinnerEvent dinner;
    private LocalDate date;

    public Schedule(LocalDate date) {
        this.date = date;
    }

    public void bookBrunchEvent(BrunchEvent event) {
        if (this.brunch != null) {
            throw new IllegalStateException("Brunch has already been scheduled for this date");
        }
        this.brunch = event;
    }

    public void bookDinnerEvent(DinnerEvent event) {
        if (this.dinner != null) {
            throw new IllegalStateException("Dinner has already been scheduled for this date.");
        }
        this.dinner = event;
    }

    public BrunchEvent getBrunch() {
        return brunch;
    }

    public LocalDate getDate() {
        return date;
    }

    public DinnerEvent getDinner() {
        return dinner;
    }
}
