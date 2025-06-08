package Problem1;

import java.time.LocalDate;

/**
 * The type Part time employee as a class which extends Problem1.Employee abstract class
 */
public abstract class PartTimeEmployee extends Employee {
    /**
     * The Contract hours.
     */
    protected double contractHours;
    /**
     * The Hourly hours worked.
     */
    protected double hourlyHoursWorked;
    /**
     * The Bonus and overtime hours.
     */
    protected double bonusAndOvertimeHours;

    /**
     * Instantiates a new Part time employee.
     *
     * @param contactInfo           the contact info as a class
     * @param educationLevel        the education level as an ENUM class
     * @param employeeID            the employee id as a String
     * @param employmentDate        the employment date as a LocalDate
     * @param employmentLevel       the employment level as an ENUM class
     * @param lastYearSalary        the last year salary as a Double
     * @param bonusAndOvertimeHours the bonus and overtime hours as a double
     * @param contractHours         the contract hours as a double
     * @param hourlyHoursWorked     the hourly hours worked as a double
     */
    public PartTimeEmployee(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary, double bonusAndOvertimeHours, double contractHours, double hourlyHoursWorked) {
        super(contactInfo, educationLevel, employeeID, employmentDate, employmentLevel, lastYearSalary);
        this.bonusAndOvertimeHours = bonusAndOvertimeHours;
        this.contractHours = contractHours;
        this.hourlyHoursWorked = hourlyHoursWorked;
    }

    /**
     * Gets bonus and overtime hours.
     *
     * @return the bonus and overtime hours
     */
    public double getBonusAndOvertimeHours() {
        return bonusAndOvertimeHours;
    }

    /**
     * Gets contract hours.
     *
     * @return the contract hours
     */
    public double getContractHours() {
        return contractHours;
    }


    /**
     * Gets hourly hours worked.
     *
     * @return the hourly hours worked
     */
    public double getHourlyHoursWorked() {
        return hourlyHoursWorked;
    }

    @Override
    public double estimateProductivity() {
        double estimatedProductivity =  (double) (((double) this.hourlyHoursWorked / this.contractHours) * 3.7);
        return estimatedProductivity;
    }

}
