package Problem1;

import java.time.LocalDate;

public class Manager extends FullTimeEmployee {
    private int employeesManaged;

    public Manager(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary, double basePay, double bonuses, LocalDate lastPromotion, int numberOfProjects, double overTime, int employeesManaged) {
        super(contactInfo, educationLevel, employeeID, employmentDate, employmentLevel, lastYearSalary, basePay, bonuses, lastPromotion, numberOfProjects, overTime);
        this.employeesManaged = employeesManaged;
    }

    public int getEmployeesManaged() {
        return employeesManaged;
    }
    @Override
    public double estimateProductivity() {
        double estimatedProductivity = this.lastYearSalary / this.basePay;

        if (this.employeesManaged > 8) {
            estimatedProductivity += 1.8;
        }
        if (employmentLevel == EmploymentLevel.INTERMEDIATE_LEVEL) {
            estimatedProductivity += 1.4;
        }

        if (lastPromotion.isBefore(LocalDate.now().minusYears(3))) {
            estimatedProductivity -= 0.8;
        }

        return estimatedProductivity;
    }
}
