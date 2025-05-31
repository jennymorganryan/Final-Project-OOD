import java.time.LocalDate;

public class DinnerEvent extends Event {
    private int vegEntrees;
    private int veganEntrees;
    private int nonvegEntrees;


    public DinnerEvent(int attendees, String customerName, LocalDate date, double estimatedCateringCost, int nonvegEntrees, int veganEntrees, int vegEntrees) {
        super(attendees, customerName, date, estimatedCateringCost);
        if (attendees < 10 || attendees > 75) {
            throw new IllegalArgumentException("Dinner attendees must be between 10 and 75");
        }
        this.nonvegEntrees = (int) Math.ceil(attendees * 0.80);
        this.veganEntrees = (int) Math.ceil(attendees * 0.10);
        this.vegEntrees = (int) Math.ceil(attendees * 0.20);
    }

    public int getNonvegEntrees() {
        return nonvegEntrees;
    }

    public int getVeganEntrees() {
        return veganEntrees;
    }

    public int getVegEntrees() {
        return vegEntrees;
    }
}
