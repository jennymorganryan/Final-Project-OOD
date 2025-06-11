package Problem1;

import java.util.Arrays;
import java.util.Objects;

public class WaterAndInvisibilityCharacter extends AbstractMultiPowerCharacter{

    private static final Double LEGENDARY_DECREASE = 0.75;
    private Boolean isLegendary;

    public WaterAndInvisibilityCharacter(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight, String primaryPower, String[] specialAbilities, Boolean isLegendary) {
        super(characterCombatLevel, healthLevel, height, name, regions, weight, primaryPower, specialAbilities);
        this.isLegendary = isLegendary;
    }

    public Boolean getLegendary() {
        return isLegendary;
    }
    @Override
    public Double estimateCaptureLiklihood() {
        //todo
        //return super.
        return 0.0;
    }
private Double calculateLegendaryDecrease() {
        if(this.isLegendary) {
            return LEGENDARY_DECREASE;
            else return 1.0;
        }
}
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WaterAndInvisibilityCharacter that = (WaterAndInvisibilityCharacter) o;
        return Objects.equals(isLegendary, that.isLegendary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isLegendary);
    }

    @Override
    public String toString() {
        return "WaterAndInvisibilityCharacter{" +
                "isLegendary=" + isLegendary +
                ", primaryPower='" + primaryPower + '\'' +
                ", specialAbilities=" + Arrays.toString(specialAbilities) +
                ", characterCombatLevel=" + characterCombatLevel +
                ", healthLevel=" + healthLevel +
                ", name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", weight=" + weight +
                '}';
    }
}
