package Problem4;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * The type Ice power character which extends AbstractSinglePowerCharacter
 */
public class IcePowerCharacter extends AbstractSinglePowerCharacter{
    /**
     * Instantiates a new Ice power character.
     * @param combatLevel          the combat level as a double number
     * @param healthLevel          the health level as a double number
     * @param height               the height as a double number
     * @param name                 the name as a string representation
     * @param regions              the regions as an array of strings
     * @param weight               the weight as a double number
     * @param attacks              the attacks as an array of strings
     * @param lastBattleDate       the last battle date as a local date
     * @param strongestAttackValue the strongest attack value as a double number
     */
    public IcePowerCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight, String[] attacks, LocalDate lastBattleDate, double strongestAttackValue) {
        super(combatLevel, healthLevel, height, name, regions, weight, attacks, lastBattleDate, strongestAttackValue);
    }

    @Override
    public String toString() {
        return "IcePowerCharacter{" +
                "attacks=" + Arrays.toString(attacks) +
                ", lastBattleDate=" + lastBattleDate +
                ", strongestAttackValue=" + strongestAttackValue +
                ", combatLevel=" + combatLevel +
                ", healthLevel=" + healthLevel +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", weight=" + weight +
                '}';
    }
}
