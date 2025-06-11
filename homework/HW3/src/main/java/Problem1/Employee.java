package Problem1;

import java.time.LocalDate;

/**
 * Problem1.Employee abstract class
 */
public abstract class Employee {
    protected String employeeID;
    protected ContactInfo contactInfo;
    protected LocalDate employmentDate;
    protected EducationLevel educationLevel;
    protected EmploymentLevel employmentLevel;
    protected Double lastYearSalary;

    /**
     * Instantiates a new Problem1.Employee.
     *
     * @param contactInfo     the contact info as a class
     * @param educationLevel  the education level as an ENUM class
     * @param employeeID      the employee id as a String
     * @param employmentDate  the employment date as a LocalDate
     * @param employmentLevel the employment level as an ENUM class
     * @param lastYearSalary  the last year salary as a Double
     */
    public Employee(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary) {
        this.contactInfo = contactInfo;
        this.educationLevel = educationLevel;
        this.employeeID = employeeID;
        this.employmentDate = employmentDate;
        this.employmentLevel = employmentLevel;
        this.lastYearSalary = lastYearSalary;
    }

    /**
     * Estimate productivity double.
     *
     * @return the double
     */
    public abstract double estimateProductivity();


    /**
     * Gets contact info.
     *
     * @return the contact info
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Gets education level.
     *
     * @return the education level
     */
    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    /**
     * Gets employee id.
     *
     * @return the employee id
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Gets employment date.
     *
     * @return the employment date
     */
    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    /**
     * Gets employment level.
     *
     * @return the employment level
     */
    public EmploymentLevel getEmploymentLevel() {
        return employmentLevel;
    }

    /**
     * Gets last year salary.
     *
     * @return the last year salary
     */
    public Double getLastYearSalary() {
        return lastYearSalary;
    }
}
