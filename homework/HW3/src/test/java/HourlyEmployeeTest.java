import Problem1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    HourlyEmployee employee;

    @BeforeEach
    void setUp() {
        Name jenny = new Name("Jenny", "Morgan");
        Name maria = new Name("Maria", "Carroll");
        ContactInfo contact = new ContactInfo("20th Ave Seattle", "jenny0712@gmail.com", maria, jenny, "6146336994");

        employee = new HourlyEmployee(
                contact,
                EducationLevel.BACHELORS_DEGREE,
                "HE456",
                LocalDate.of(2020, 1, 1),
                EmploymentLevel.INTERMEDIATE_LEVEL,
                30000.0,
                4.0,
                10.0,
                10.0,
                13.0
        );
    }

    @Test
    void getHourlyEarnings() {
        assertEquals(13.0, employee.getHourlyEarnings());
    }

    @Test
    void estimateProductivity() {
        double expected = (10.0 / 10.0) * 3.7 + 1.4 + 3.0;
        double result = employee.estimateProductivity();
        assertEquals(expected, result, 0.001);
    }
}