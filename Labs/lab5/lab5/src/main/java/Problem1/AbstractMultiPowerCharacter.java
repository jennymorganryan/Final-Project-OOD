package Problem1;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractMultiPowerCharacter extends AbstractCharacter{

    protected String primaryPower;
    protected String[] specialAbilities;

    public AbstractMultiPowerCharacter(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight, String primaryPower, String[] specialAbilities) {
        super(characterCombatLevel, healthLevel, height, name, regions, weight);
        this.primaryPower = primaryPower;
        this.specialAbilities = specialAbilities;
    }
    public String[] getAttack() {
        return valueOfStrongestAttack;
    }

    public String getPrimaryPower() {
        return primaryPower;
    }

    public String[] getSpecialAbilities() {
        return specialAbilities;
    }
    public Double estimateCaptureLiklihood() {
      return super.estimateCaptureLiklihood() * this.calculateSinglePowerCaptureDecrease();
        }
    }

    private Double calculateSinglePowerCaptureDecrease() {
        if (this.getAttacks().length >= ATTACK_NUM_CUTOFF) {
            return SINGLE_POWER_CHARACTER_CAPTURE_DECREASE;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AbstractMultiPowerCharacter that = (AbstractMultiPowerCharacter) o;
        return Objects.equals(primaryPower, that.primaryPower) && Objects.deepEquals(specialAbilities, that.specialAbilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), primaryPower, Arrays.hashCode(specialAbilities));
    }
}
