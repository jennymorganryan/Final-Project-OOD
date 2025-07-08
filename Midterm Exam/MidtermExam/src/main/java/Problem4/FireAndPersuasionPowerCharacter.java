package Problem4;

import java.util.Arrays;

/**
 * The type Fire and persuasion power character.
 */
public class FireAndPersuasionPowerCharacter extends AbstractMultiplePowersCharacter{
    /**
     * Instantiates a new Fire and persuasion power character.
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
    public FireAndPersuasionPowerCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight, String primaryPower, String[] specialAbilities) {
        super(combatLevel, healthLevel, height, name, regions, weight, primaryPower, specialAbilities);
    }
    /**
     * returns the likelihood of capture
     *
     * @return the likelihood
     */

    @Override
    public double estimateCaptureLikelihood() {
        return getBase();
    }

    @Override
    public String toString() {
        return "FireAndPersuasionPowerCharacter{" +
                "primaryPower='" + primaryPower + '\'' +
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
