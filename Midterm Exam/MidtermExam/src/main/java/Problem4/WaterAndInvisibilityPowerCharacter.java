package Problem4;

import java.util.Arrays;
import java.util.Objects;

/**
 * The type Water and invisibility power character.
 */
public class WaterAndInvisibilityPowerCharacter extends AbstractMultiplePowersCharacter {
    private boolean isLegendary;

    /**
     * Instantiates a new Water and invisibility power character.
     *
     * @param combatLevel      the combat level as a double number
     * @param healthLevel      the health level as a double number
     * @param height           the height as a double number
     * @param name             the name as a string
     * @param regions          the regions as an array of strings
     * @param weight           the weight as a double number
     * @param primaryPower     the primary power as an array of strings
     * @param specialAbilities the special abilities as an array of strings
     * @param isLegendary      the is legendary as a boolean value to represent if character is legendary
     */
    public WaterAndInvisibilityPowerCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight, String primaryPower, String[] specialAbilities, boolean isLegendary) {
        super(combatLevel, healthLevel, height, name, regions, weight, primaryPower, specialAbilities);
        this.isLegendary = isLegendary;
    }
    /**
     * returns the likelihood of capture
     *
     * @return the likelihood
     */
    @Override
    public double estimateCaptureLikelihood() {
        double likelihood = getBase();
        if (isLegendary) {
            likelihood *= 0.75;
        }
        return likelihood;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof WaterAndInvisibilityPowerCharacter that)) return false;
        return isLegendary == that.isLegendary;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isLegendary);
    }

    @Override
    public String toString() {
        return "WaterAndInvisibilityPowerCharacter{" +
                "isLegendary=" + isLegendary +
                ", primaryPower='" + primaryPower + '\'' +
                ", specialAbilities=" + Arrays.toString(specialAbilities) +
                ", combatLevel=" + combatLevel +
                ", healthLevel=" + healthLevel +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", weight=" + weight +
                '}';
    }
}
