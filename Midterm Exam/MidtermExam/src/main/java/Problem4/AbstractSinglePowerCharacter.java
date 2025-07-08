package Problem4;

import java.time.LocalDate;

/**
 * The type Abstract single power character extends AbstractCharacter
 */
public abstract class AbstractSinglePowerCharacter extends AbstractCharacter {

    protected String[] attacks;
    protected double strongestAttackValue;
    protected LocalDate lastBattleDate;

    /**
     * Instantiates a new Abstract single power character.
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
    public AbstractSinglePowerCharacter(double combatLevel, double healthLevel, double height, String name, String[] regions, double weight, String[] attacks, LocalDate lastBattleDate, double strongestAttackValue) {
        super(combatLevel, healthLevel, height, name, regions, weight);
        this.attacks = attacks;
        this.lastBattleDate = lastBattleDate;
        this.strongestAttackValue = strongestAttackValue;
    }

    /**
     * Gets base.
     *
     * @return the base
     */
    public double getBase() {
        return combatLevel / healthLevel;
    }

    /**
     * returns the likelihood of capture
     *
     * @return likelihood
     */
    @Override
    public double estimateCaptureLikelihood() {
        double likelihood = getBase();

        if (attacks.length > 5) {
            likelihood *= 0.7;
        }
        if (lastBattleDate != null && lastBattleDate.isAfter(LocalDate.now().minusDays(14))) {
            likelihood *= 1.3;
        }
        return likelihood;
    }
}
