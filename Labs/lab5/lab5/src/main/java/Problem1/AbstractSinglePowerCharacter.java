package Problem1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractSinglePowerCharacter extends AbstractCharacter{

    private static final int ATTACK_NUM_CUTOFF = 5;
    private static final Double SINGLE_POWER_CHARACTER_CAPTURE_DECREASE = 0.7;
    private static final long DAYS_TO_SUBTRACT = 14;
    private static final Double LAST_BATTLE_CAPTURE_INCREASE = 1.3;
    protected String[] attacks;
    protected Double  valueOfStrongestAttack;
    protected LocalDate dateofLastBattle;

    public AbstractSinglePowerCharacter(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight, String[] attacks, LocalDate dateofLastBattle, Double valueOfStrongestAttack) {
        super(characterCombatLevel, healthLevel, height, name, regions, weight);
        this.attacks = attacks;
        this.dateofLastBattle = dateofLastBattle;
        this.valueOfStrongestAttack = valueOfStrongestAttack;
    }

    private Double calculateSinglePowerCaptureDecrease() {
        if (this.getAttacks().length >= ATTACK_NUM_CUTOFF) {
            return SINGLE_POWER_CHARACTER_CAPTURE_DECREASE;
            else return 1.0;
        }
    }
    //todo override

    private Double calculateLastBattleIncrease() {
        LocalDate dateCutoff = LocalDate.now().minusDays(DAYS_TO_SUBTRACT);
        if(this.getDateofLastBattle().isAfter(dateCutoff))
            return 1.0;
        else return LAST_BATTLE_CAPTURE_INCREASE;
    }

    public String[] getAttacks() {
        return attacks;
    }

    public LocalDate getDateofLastBattle() {
        return dateofLastBattle;
    }

    public Double getValueOfStrongestAttack() {
        return valueOfStrongestAttack;
    }
    public Double estimateCaptureLikelihood() {
        Double baseRate = super.estimateCaptureLikelihood();
        Double modifier = 1.0;

        if (this.attacks.length > ATTACK_NUM_CUTOFF) {
            modifier *= SINGLE_POWER_CHARACTER_CAPTURE_DECREASE;
        }

        if (this.dateofLastBattle != null &&
                this.dateofLastBattle.isAfter(LocalDate.now().minusDays(DAYS_TO_SUBTRACT))) {
            modifier *= 1.3;
        }

        return baseRate * modifier;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractSinglePowerCharacter that = (AbstractSinglePowerCharacter) o;
        return Objects.deepEquals(attacks, that.attacks) && Objects.equals(valueOfStrongestAttack, that.valueOfStrongestAttack) && Objects.equals(dateofLastBattle, that.dateofLastBattle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(attacks), valueOfStrongestAttack, dateofLastBattle);
    }

}
