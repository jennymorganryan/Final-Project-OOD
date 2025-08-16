/**
 * Overview
 * This class knows the vertical meters for each lift number.
 * Lifts 1 through 20 are 200 meters. Lifts 21 through 40 are 500 meters.
 * Other classes call getVerticalForLift to ask for the number for one lift.
 */
public class LiftData {

    //vertical[i] is the vertical meters for lift i
    //index 0 is unused so that index 1 to 40 match lift 1 to 40
    private final int[] vertical = new int[41];

    public LiftData() {
        //Fill in the rule once when this object is created
        for (int i = 1; i <= 20; i++) vertical[i] = 200;
        for (int i = 21; i <= 40; i++) vertical[i] = 500;
    }

    /**
     * Return the vertical meters for the given lift
     */
    public int getVerticalForLift(int liftId) {
        if (liftId < 1 || liftId > 40) {
            throw new IllegalArgumentException("liftId must be between 1 and 40");
        }
        return vertical[liftId];
    }
}
