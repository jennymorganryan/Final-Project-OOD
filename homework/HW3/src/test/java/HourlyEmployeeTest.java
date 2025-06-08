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
        //expected:
        // 10.0 / 10.0 > actualHoursWorked / contractHours = 10 hours worked out of 10 expected hours
         // * 3.7 > base multiplier for all part-time employees
        // + 1.4 > bonus for being at INTERMEDIATE employment level
        // + 3.0 > bonus for having hourly earnings less than $14
        double expected = (10.0 / 10.0) * 3.7 + 1.4 + 3.0;
        double result = employee.estimateProductivity();
        assertEquals(expected, result, 0.001);
    }
}