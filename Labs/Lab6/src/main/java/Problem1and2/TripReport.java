package Problem1and2;

import java.util.Objects;

/**
 * The type Trip report.
 */
public class TripReport {

    private Vehicle vehicle;
    private Float speed;
    private Float distance;
    private Integer duration;

    /**
     * Instantiates a new Trip report.
     *
     * @param distance the distance as a float in miles
     * @param duration the duration as an integer in minutes
     * @param speed    the speed as a float in miles per minutes
     * @param vehicle  the vehicle as a custome dat type vehicle
     */
    public TripReport(Float distance, Integer duration, Float speed, Vehicle vehicle) {
        this.distance = distance;
        this.duration = duration;
        this.speed = speed;
        this.vehicle = vehicle;
    }

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public Float getDistance() {
        return distance;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Gets speed.
     *
     * @return the speed
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Gets vehicle.
     *
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TripReport that)) return false;
        return Objects.equals(vehicle, that.vehicle) && Objects.equals(speed, that.speed) && Objects.equals(distance, that.distance) && Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicle, speed, distance, duration);
    }

    @Override
    public String toString() {
        return "TripReport{" +
                "distance=" + distance +
                ", vehicle=" + vehicle +
                ", speed=" + speed +
                ", duration=" + duration +
                '}';
    }
}
