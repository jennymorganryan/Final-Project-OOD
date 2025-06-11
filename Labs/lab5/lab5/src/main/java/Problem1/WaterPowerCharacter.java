package Problem1;

import java.time.LocalDate;

public class WaterPowerCharacter extends AbstractSinglePowerCharacter {

    public WaterPowerCharacter(Double characterCombatLevel, Double healthLevel, Double height, String name, String[] regions, Double weight, String[] attacks, LocalDate dateofLastBattle, Double valueOfStrongestAttack) {
        super(characterCombatLevel, healthLevel, height, name, regions, weight, attacks, dateofLastBattle, valueOfStrongestAttack);
    }

    @Override
    public Double estimateCaptureLiklihood() {
        //todo
        return 0.0;
    }
}
