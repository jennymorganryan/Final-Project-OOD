package Problem1and2;

public class FleetManager {

    public TripReport drive(float distance, Vehicle vehicle) {
        int duration = calculateDuration(distance, vehicle.getAvgSpeed());
        return new TripReport(vehicle, vehicle.getAvgSpeed(), distance, duration);
    }

    public TripReport drive(int duration, Vehicle vehicle) {
        float distance = calculateDistance(duration, vehicle.getAvgSpeed());
        return new TripReport(vehicle, vehicle.getAvgSpeed(), distance, duration);
    }

    public TripReport drive(float distance, float speed, int duration, Vehicle vehicle) {
        if (validateInputs(distance, speed, duration)) {
            return new TripReport(vehicle, speed, distance, duration);
        } else {
            throw new IllegalArgumentException("Something went wrong with the provided inputs — laws of physics are not maintained");
        }
    }

    public TripReport drive(float distance, float speed, Vehicle vehicle) {
        float confirmedSpeed = confirmVehicleSpeed(speed, vehicle);
        int duration = calculateDuration(distance, confirmedSpeed);
        return new TripReport(vehicle, confirmedSpeed, distance, duration);
    }

    private int calculateDuration(float distance, float speed) {
        if (speed == 0) {
            throw new IllegalArgumentException("Speed cannot be zero");
        }
        return Math.round(distance / speed);
    }

    private float calculateDistance(int duration, float speed) {
        return duration * speed;
    }

    private float confirmVehicleSpeed(float speed, Vehicle vehicle) {
        return (vehicle.getMaxSpeed() >= speed) ? speed : vehicle.getMaxSpeed();
    }

    private Boolean validateInputs(float distance, float speed, int duration) {
        return distance == duration * speed;
    }
}
