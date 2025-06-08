import Problem1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager;

    @BeforeEach
    void setUp() {
        Name jenny = new Name("Jenny", "Morgan");
        Name maria = new Name("Maria", "Carroll");
        ContactInfo contact = new ContactInfo("20th Ave Seattle", "jenny0712@gmail.com", maria, jenny, "6146336994");

        manager = new Manager(
                contact,
                EducationLevel.MASTERS_DEGREE,
                "M123",
                LocalDate.of(2018, 5, 15),
                EmploymentLevel.INTERMEDIATE_LEVEL,
                100000.0,
                60000.0,
                10000.0,
                LocalDate.of(2019, 1, 1),
                5,
                5000.0,
                10
        );
    }

    @Test
    void getEmployeesManaged() {
        assertEquals(10, manager.getEmployeesManaged());
    }

    @Test
    void estimateProductivity() {
        double expected = 100000.0 / 60000.0 + 1.8 + 1.4 - 0.8;
        double result = manager.estimateProductivity();
        assertEquals(expected, result, 0.001);
    }
}