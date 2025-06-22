package Problem1and2;

public class FleetManager {
    public TripReport drive (float distance, Vehicle vehicle) {
        return new TripReport(vehicle, vehicle.getAvgSpeed(), distance, this.calculateDuration());
    }

    private int calculateDuration(float distance, float speed) {
        if (speed == 0)
            throw new IllegalArgumentException("Speed cannot be zero");
        else return Math.round(distance /speed);
    }
}


