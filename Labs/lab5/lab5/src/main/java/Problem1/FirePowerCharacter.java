package Problem1;

import java.time.LocalDate;
import java.util.Arrays;

public class FirePowerCharacter extends AbstractSinglePowerCharacter {

    public FirePowerCharacter(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight, String[] attacks, LocalDate dateofLastBattle, Double valueOfStrongestAttack) {
        super(characterCombatLevel, healthLevel, height, name, regions, weight, attacks, dateofLastBattle, valueOfStrongestAttack);
    }

    @Override
    public Double estimateCaptureLiklihood() {
        //todo
        return 0.0
    }

    @Override
    public String toString() {
        return "FirePowerCharacter{" +
                "attacks=" + Arrays.toString(attacks) +
                ", dateofLastBattle=" + dateofLastBattle +
                ", valueOfStrongestAttack=" + valueOfStrongestAttack +
                ", characterCombatLevel=" + characterCombatLevel +
                ", healthLevel=" + healthLevel +
                ", name='" + name + '\'' +
                ", regions=" + Arrays.toString(regions) +
                ", weight=" + weight +
                '}';
    }
}
