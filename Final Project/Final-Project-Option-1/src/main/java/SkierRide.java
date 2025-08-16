/**
 * Overview
 * This class just holds one ride from the CSV file.
 * It stores exactly the five values from one row in the CSV.
 * Other classes read these values with the getter methods.
 */
public class SkierRide {

    private final String resortId;
    private final String dayNumber;
    private final int minuteOffset;  // minutes after 9 am
    private final String skierId;
    private final int liftId;

    public SkierRide(String resortId, String dayNumber, int minuteOffset, String skierId, int liftId) {
        this.resortId = resortId;
        this.dayNumber = dayNumber;
        this.minuteOffset = minuteOffset;
        this.skierId = skierId;
        this.liftId = liftId;
    }

    public String getResortId() { return resortId; }
    public String getDayNumber() { return dayNumber; }
    public int getMinuteOffset() { return minuteOffset; }
    public String getSkierId() { return skierId; }
    public int getLiftId() { return liftId; }
}
