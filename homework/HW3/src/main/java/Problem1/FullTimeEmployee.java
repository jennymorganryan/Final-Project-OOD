package Problem1;

import java.time.LocalDate;

/**
 * The type Full time employee as a class which extends Problem1.Employee abstract class
 */
public abstract class FullTimeEmployee extends Employee {
    /**
     * The Base pay.
     */
    protected double basePay;
    /**
     * The Bonuses.
     */
    protected double bonuses;
    /**
     * The Over time.
     */
    protected double overTime;
    /**
     * The Last promotion.
     */
    protected LocalDate lastPromotion;
    /**
     * The Number of projects.
     */
    protected int numberOfProjects;


    /**
     * Instantiates a new Full time employee.
     *
     * @param contactInfo      the contact info as a class
     * @param educationLevel   the education level as an ENUM class
     * @param employeeID       the employee id as a String
     * @param employmentDate   the employment date as an employmentDate
     * @param employmentLevel  the employment level as an ENUM class
     * @param lastYearSalary   the last year salary as a Double
     * @param basePay          the base pay as a double
     * @param bonuses          the bonuses as a double
     * @param lastPromotion    the last promotion as a LocalDate
     * @param numberOfProjects the number of projects as an int
     * @param overTime         the over time as a double
     */
    public FullTimeEmployee(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary, double basePay, double bonuses, LocalDate lastPromotion, int numberOfProjects, double overTime) {
        super(contactInfo, educationLevel, employeeID, employmentDate, employmentLevel, lastYearSalary);
        this.basePay = basePay;
        this.bonuses = bonuses;
        this.lastPromotion = lastPromotion;
        this.numberOfProjects = numberOfProjects;
        this.overTime = overTime;
    }

    /**
     * Gets base pay.
     *
     * @return the base pay
     */
    public double getBasePay() {
        return basePay;
    }

    /**
     * Gets bonuses.
     *
     * @return the bonuses
     */
    public double getBonuses() {
        return bonuses;
    }


    /**
     * Gets last promotion.
     *
     * @return the last promotion
     */
    public LocalDate getLastPromotion() {
        return lastPromotion;
    }

    /**
     * Gets number of projects.
     *
     * @return the number of projects
     */
    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    /**
     * Gets over time.
     *
     * @return the over time
     */
    public double getOverTime() {
        return overTime;
    }
    @Override
    public double estimateProductivity() {
        double estimatedProductivity = this.lastYearSalary / this.basePay;

        if (this.numberOfProjects > 2) {
            estimatedProductivity += 1.5;
        }
        return estimatedProductivity;
}
}
