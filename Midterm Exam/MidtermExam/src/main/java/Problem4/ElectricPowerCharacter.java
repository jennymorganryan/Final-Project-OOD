package Problem4;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * The type Electric power character.
 */
public class ElectricPowerCharacter extends AbstractSinglePowerCharacter {
    /**
     * Instantiates a new Electric power character.
     *
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
    public ElectricPowerCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight, String[] attacks, LocalDate lastBattleDate, double strongestAttackValue) {
        super(combatLevel, healthLevel, height, name, regions, weight, attacks, lastBattleDate, strongestAttackValue);
    }

    @Override
    public String toString() {
        return "ElectricPowerCharacter{" +
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
