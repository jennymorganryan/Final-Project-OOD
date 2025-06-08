import Problem1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BenefitsEligibleEmployeeTest {
    BenefitsEligibleEmployee employee;

    @BeforeEach
    void setUp() {
        Name jenny = new Name("Jenny", "Morgan");
        Name maria = new Name("Maria", "Carroll");
        ContactInfo contact = new ContactInfo("20th Ave Seattle", "jenny0712@gmail.com", maria, jenny, "6146336994");

        employee = new BenefitsEligibleEmployee(
                contact,
                EducationLevel.BACHELORS_DEGREE,
                "BE123",
                LocalDate.of(2020, 1, 1),
                EmploymentLevel.INTERMEDIATE_LEVEL,
                40000.0,
                5.0,
                10.0,
                10.0
        );
    }

    @Test
    void estimateProductivity() {
        double result = employee.estimateProductivity();
        double expected = (10.0 / 10.0) * 3.7 + 1.4;
        assertEquals(expected, result, 0.001);
    }
}