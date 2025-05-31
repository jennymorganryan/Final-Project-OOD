import java.time.LocalDate;

public class Event {
    private LocalDate date;
    private int attendees;
    private double estimatedCateringCost;
    private String customerName;

    public Event(int attendees, String customerName, LocalDate date, double estimatedCateringCost) {
        this.attendees = attendees;
        this.customerName = customerName;
        this.date = date;
        this.estimatedCateringCost = estimatedCateringCost;
    }

    public int getAttendees() {
        return attendees;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getEstimatedCateringCost() {
        return estimatedCateringCost;
    }
}
