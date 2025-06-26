package problem2;
import Problem2.Name;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


/**
 * The type Superhero represents a superhero and all of their qualities
 */
public class Superhero {
    private static final Double COMBAT_POWER_LIMIT = 0.0;
    private static final Double MIN_WEALTH_LEVEL = 0.0;
    private static final Double MAX_WEALTH_LEVEL = 100.0;
    private Name name;
    private Integer age;
    private Double height;
    private Double weight;
    private List<String> powers;
    private List<String> attacks;
    private LocalDate dateOfLastBattle;
    protected Double combatPower;
    protected Double healthLevel;


    /**
     * Instantiates a new Superhero.
     *
     * @param name             the name of the superhero as a String
     * @param age              the age of the superhero as an integer
     * @param height           the height of the superhero represented by a double for more accurate measurement
     * @param weight           the weight of the superhero represented by a double for more accurate measurement
     * @param powers           the powers of the superhero stored in a list
     * @param attacks          the attacks of the superhero stored in a list
     * @param dateOfLastBattle the date of last battle represented by a date
     * @param combatPower      the combat power represented by a double
     * @param healthLevel      the health level represented by a double
     */
    public Superhero(Name name, Integer age, Double height, Double weight, List<String> powers,
                     List<String> attacks, LocalDate dateOfLastBattle, Double combatPower, Double healthLevel) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.powers = powers;
        this.attacks = attacks;
        this.dateOfLastBattle = dateOfLastBattle;
        this.combatPower = combatPower;
        this.healthLevel = healthLevel;
    }


    /**
     * Gets name.
     *
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Gets powers.
     *
     * @return the powers
     */
    public List<String> getPowers() {
        return powers;
    }

    /**
     * Gets attacks.
     *
     * @return the attacks
     */
    public List<String> getAttacks() {
        return attacks;
    }

    /**
     * Gets date of last battle.
     *
     * @return the date of last battle
     */
    public LocalDate getDateOfLastBattle() {
        return dateOfLastBattle;
    }

    /**
     * Gets combat power.
     *
     * @return the combat power
     */
    public Double getCombatPower() {
        return combatPower;
    }

    /**
     * Gets health level.
     *
     * @return the health level
     */
    public Double getHealthLevel() {
        return healthLevel;
    }

    /**
     * Add new power.
     *
     * @param power the power
     * @throws problem2.InvalidAbilityException the invalid ability exception
     */
    public void addNewPower(String power) throws problem2.InvalidAbilityException {
        if (this.powers.contains(power) || this.powers.size() < 10) {
            throw new problem2.InvalidAbilityException("Duplicate powers are not allowed");
        }
        this.powers.add(power);
    }

    /**
     * Update date of last battle boolean.
     *
     * @param dateOfLastBattle the date of last battle
     * @return the boolean
     */
    public Boolean updateDateOfLastBattle(LocalDate dateOfLastBattle) {
        LocalDate lastLastBattle = this.dateOfLastBattle;

        if (lastLastBattle.isBefore(dateOfLastBattle.minusDays(20))) {
            this.dateOfLastBattle = dateOfLastBattle;
            return true;

        } else {
            this.dateOfLastBattle = dateOfLastBattle;
            return false;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Superhero superhero = (Superhero) o;
        return Objects.equals(name, superhero.name) && Objects.equals(age,
                superhero.age) && Objects.equals(height, superhero.height)
                && Objects.equals(weight, superhero.weight) && Objects.equals(powers,
                superhero.powers) && Objects.equals(attacks, superhero.attacks)
                && Objects.equals(dateOfLastBattle, superhero.dateOfLastBattle)
                && Objects.equals(combatPower, superhero.combatPower) && Objects.equals(
                healthLevel, superhero.healthLevel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, powers, attacks, dateOfLastBattle, combatPower,
                healthLevel);
    }
}

