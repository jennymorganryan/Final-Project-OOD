package Problem1;

import java.time.LocalDate;

/**
 * The type Hourly employee as a class extension of Problem1.PartTimeEmployee
 */
public class HourlyEmployee extends PartTimeEmployee {
    private double hourlyEarnings;

    /**
     * Instantiates a new Hourly employee.
     *
     * @param contactInfo           the contact info as a class
     * @param educationLevel        the education level as a String
     * @param employeeID            the employee id as String
     * @param employmentDate        the employment date as a LocalDate
     * @param employmentLevel       the employment level as an ENUM clas
     * @param lastYearSalary        the last year salary as a Double
     * @param bonusAndOvertimeHours the bonus and overtime hours as a double
     * @param contractHours         the contract hours as a double
     * @param hourlyHoursWorked     the hourly hours worked as a double
     * @param hourlyEarnings        the hourly earnings as a double
     */
    public HourlyEmployee(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary, double bonusAndOvertimeHours, double contractHours, double hourlyHoursWorked, double hourlyEarnings) {
        super(contactInfo, educationLevel, employeeID, employmentDate, employmentLevel, lastYearSalary, bonusAndOvertimeHours, contractHours, hourlyHoursWorked);
        this.hourlyEarnings = hourlyEarnings;
    }

    /**
     * Gets hourly earnings.
     *
     * @return the hourly earnings
     */
    public double getHourlyEarnings() {
        return hourlyEarnings;
    }
    @Override
    public double estimateProductivity() {
        double estimatedProductivity =  (double) (((double) this.hourlyHoursWorked / this.contractHours) * 3.7);
        if (employmentLevel == EmploymentLevel.INTERMEDIATE_LEVEL) {
            estimatedProductivity += 1.4;
        }

        if (hourlyEarnings < 14) {
            estimatedProductivity += 3;
        }

        return estimatedProductivity;
    }
}
