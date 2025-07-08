package Problem4;

/**
 * The type Abstract character.
 */
public abstract class AbstractCharacter {

    protected String name;
    protected double weight;
    protected double height;
    protected String[] regions;
    protected double combatLevel;
    protected double healthLevel;

    /**
     * Instantiates a new Abstract character.
     *
     * @param combatLevel      the combat level as a double number
     * @param healthLevel      the health level as a double number
     * @param height           the height as a double number
     * @param name             the name as a string
     * @param regions          the regions as an array of strings
     * @param weight           the weight as a double number
     */
    public AbstractCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight) {
        this.combatLevel = combatLevel;
        this.healthLevel = healthLevel;
        this.height = height;
        this.name = name;
        this.regions = regions;
        this.weight = weight;
    }

    /**
     * returns the likelihood of capture
     *
     * @return the likelihood as a double
     */
    public abstract double estimateCaptureLikelihood();
}
