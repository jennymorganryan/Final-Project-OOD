/**
 * Overview
 * This class keeps totals for one skier.
 * It stores how many rides they took and how many vertical meters they skied.
 * AppController keeps one of these per skier id.
 */
public class SkierData {

    private long rides;    // how many rides
    private long vertical; // total vertical in meters

    /**
     * Add one ride for this skier and add that ride's vertical meters to the total
     */
    public void addRide(int verticalMeters) {
        this.rides = this.rides + 1;
        this.vertical = this.vertical + verticalMeters;
    }

    public long getRides() { return rides; }
    public long getVertical() { return vertical; }
}
