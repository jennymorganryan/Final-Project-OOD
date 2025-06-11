package Problem1;

import java.util.Arrays;

public class SpeedAndFire extends AbstractMultiPowerCharacter{
    public SpeedAndFire(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight, String primaryPower, String[] specialAbilities) {
        super(characterCombatLevel, healthLevel, height, name, regions, weight, primaryPower, specialAbilities);
    }
    @Override
    public Double estimateCaptureLiklihood() {
        //todo
        //return super.estimateCaptureLiklihood();
        return 0.0;
    }

    @Override
    public String toString() {
        return "SpeedAndFire{" +
                "primaryPower='" + primaryPower + '\'' +
                ", specialAbilities=" + Arrays.toString(specialAbilities) +
                ", characterCombatLevel=" + characterCombatLevel +
                ", healthLevel=" + healthLevel +
                ", name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", weight=" + weight +
                '}';
    }
}
