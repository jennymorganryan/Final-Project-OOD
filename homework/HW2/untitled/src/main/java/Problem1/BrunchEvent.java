import java.time.LocalDate;

public class BrunchEvent extends Event {
    private int fruitbowls;
    private int pancakes;
    private int omelets;

    public BrunchEvent(int attendees, String customerName, LocalDate date, double estimatedCateringCost, int fruitbowls, int omelets, int pancakes) {
        super(attendees, customerName, date, estimatedCateringCost);
        if (attendees > 65 || attendees < 5) {
            throw new IllegalArgumentException("Brunch attendees must be between 5 and 65");
        }
        this.fruitbowls = (int) Math.round(attendees * 1.5);
        this.omelets = (int) Math.round(attendees * 0.65);
        this.pancakes = (int) Math.round(attendees * 1.7);
    }

    public int getFruitbowls() {
        return fruitbowls;
    }

    public int getOmelets() {
        return omelets;
    }

    public int getPancakes() {
        return pancakes;
    }
}
