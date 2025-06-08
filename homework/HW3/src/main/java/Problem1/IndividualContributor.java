package Problem1;

import java.time.LocalDate;

public class IndividualContributor extends FullTimeEmployee {
    private int numberOfPatents;
    private int numberOfPublications;
    private int numberOfExternalPublications;


    public IndividualContributor(ContactInfo contactInfo, EducationLevel educationLevel, String employeeID, LocalDate employmentDate, EmploymentLevel employmentLevel, Double lastYearSalary, Double estimatedProductivity, double basePay, double bonuses, LocalDate lastPromotion, int numberOfProjects, double overTime, int numberOfExternalPublications, int numberOfPatents, int numberOfPublications) {
        super(contactInfo, educationLevel, employeeID, employmentDate, employmentLevel, lastYearSalary, estimatedProductivity, basePay, bonuses, lastPromotion, numberOfProjects, overTime);
        this.numberOfExternalPublications = numberOfExternalPublications;
        this.numberOfPatents = numberOfPatents;
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfExternalPublications() {
        return numberOfExternalPublications;
    }

    public int getNumberOfPatents() {
        return numberOfPatents;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    @Override
    public double estimateProductivity() {

        double estimatedProductivity = this.lastYearSalary / this.basePay;

        if (this.numberOfPublications > 4) {
            estimatedProductivity += 1.3;
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
