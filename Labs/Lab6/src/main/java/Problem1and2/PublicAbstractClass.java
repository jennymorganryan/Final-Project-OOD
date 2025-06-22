package Problem1and2;

/**
 * The type Vehicle.
 */
public abstract class Vehicle {

    protected String id;
    protected Float avgSpeed;
    protected Float maxSpeed;

    /**
     * Instantiates a new Vehicle.
     *
     * @param avgSpeed the avg speed as a Float
     * @param id       the id as a String
     * @param maxSpeed the max speed as a Float
     */
    public Vehicle(Float avgSpeed, String id, Float maxSpeed) {
        this.avgSpeed = avgSpeed;
        this.id = id;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Gets avg speed.
     *
     * @return the avg speed
     */
    public Float getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets max speed.
     *
     * @return the max speed
     */
    public Float getMaxSpeed() {
        return maxSpeed;
    }
}
