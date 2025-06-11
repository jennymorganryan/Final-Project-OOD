package Problem1;

import java.util.Arrays;
import java.util.Objects;

/**
 * The type Abstract character.
 */
public abstract class AbstractCharacter implement Character {

    protected String name;
    protected Double weight;
    private Double height;
    protected String[] regions;
    protected Double characterCombatLevel;
    protected Double healthLevel;
    protected Double combatLevel;

    /**
     * Instantiates a new Abstract character.
     *
     * @param characterCombatLevel the character combat level
     * @param healthLevel          the health level
     * @param height               the height
     * @param name                 the name as a String
     * @param regions              the regions
     * @param weight               the weight
     */
    public AbstractCharacter(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight) {
        this.characterCombatLevel = characterCombatLevel;
        this.healthLevel = healthLevel;
        this.height = height;
        this.name = name;
        this.regions = regions;
        this.weight = weight;
    }

    /**
     * Gets character combat level.
     *
     * @return the character combat level
     */
    public Double getCharacterCombatLevel() {
        return characterCombatLevel;
    }

    /**
     * Gets health level.
     *
     * @return the health level
     */
    public Double getHealthLevel() {
        return healthLevel;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get refions string [ ].
     *
     * @return the string [ ]
     */
    public String[] getRegions() {
        return regions;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }
    public Double estimateCaptureLikelihood() {
        //todo
        return 0.0;
    }
    private Double calculateBaseCaptureRate () throws CaptureRateCalculationException {
        if (this.healthLevel > 0) {
            return this.combatLevel / this.healthLevel;
        } else {
                throw new CaptureRateCalculationException("Health level should be a positive value");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCharacter that = (AbstractCharacter) o;
        return Objects.equals(name, that.name) && Objects.equals(weight, that.weight) && Objects.equals(height, that.height) && Objects.deepEquals(regions, that.regions) && Objects.equals(characterCombatLevel, that.characterCombatLevel) && Objects.equals(healthLevel, that.healthLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, height, Arrays.hashCode(regions), characterCombatLevel, healthLevel);
    }

}
