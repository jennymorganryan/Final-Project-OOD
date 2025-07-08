package Problem4;

/**
 * The type Abstract multiple powers character.
 */
public abstract class AbstractMultiplePowersCharacter extends AbstractCharacter {

    protected String primaryPower;
    protected String[] specialAbilities;

    /**
     * Instantiates a new Abstract multiple powers character.
     *
     * @param combatLevel      the combat level as a double number
     * @param healthLevel      the health level as a double number
     * @param height           the height as a double number
     * @param name             the name as a string
     * @param regions          the regions as an array of strings
     * @param weight           the weight as a double number
     * @param primaryPower     the primary power as an array of strings
     * @param specialAbilities the special abilities as an array of strings
     */
    public AbstractMultiplePowersCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight, String primaryPower, String[] specialAbilities) {
        super(combatLevel, healthLevel, height, name, regions, weight);
        this.primaryPower = primaryPower;
        this.specialAbilities = specialAbilities;
    }

    /**
     * Gets base likelihood of capture
     *
     * @return the base likelihood
     */
    public double getBase() {
        return combatLevel / healthLevel;

    }
}
