package Problem1and2;

public class FleetManager {
    public TripReport drive (float distance, Vehicle vehicle) {
        return new TripReport(vehicle, vehicle.getAvgSpeed(), distance, distance /vehicle.getAvgSpeed())
    }
}
