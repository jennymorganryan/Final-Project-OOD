package Problem1;

import java.time.LocalDate;

/**
 * The type Benefits eligible employee as a class extension of Problem1.PartTimeEmployee
 */
public class BenefitsEligibleEmployee extends PartTimeEmployee {
    /**
     * Instantiates a new Benefits eligible employee.
     *
     * @param contactInfo           the contact info as a class
     * @param educationLevel        the education level as an ENUM class
     * @param employeeID            the employee id as a String
     * @param employmentDate        the employment date as a Local Date
     * @param employmentLevel       the employment level as an ENUM class
     * @param lastYearSalary        the last year salary as a Double
     * @param bonusAndOvertimeHours the bonus and overtime hours as a double
     * @param contractHours         the contract hours as a double
     * @param hourlyHoursWorked     the hourly hours worked as a double
     */
    public BenefitsEligibleEmployee(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary, double bonusAndOvertimeHours, double contractHours, double hourlyHoursWorked) {
        super(contactInfo, educationLevel, employeeID, employmentDate, employmentLevel, lastYearSalary, bonusAndOvertimeHours, contractHours, hourlyHoursWorked);
    }

    @Override
    public double estimateProductivity() {
        double estimatedProductivity = super.estimateProductivity();
        if (employmentLevel == EmploymentLevel.INTERMEDIATE_LEVEL) {
            estimatedProductivity += 1.4;
        }
        return estimatedProductivity;
    }

}
