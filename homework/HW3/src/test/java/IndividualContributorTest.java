import Problem1.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IndividualContributorTest {
    IndividualContributor individualContributor = new IndividualContributor(
            new ContactInfo("20th Ave Seattle", "jenny0712@gmail.com", new Name("Maria", "Carroll"), new Name("Jenny", "Morgan"), "6146336994"),
            EducationLevel.BACHELORS_DEGREE,
            "IC789",
            LocalDate.of(2019, 1, 1),
            EmploymentLevel.INTERMEDIATE_LEVEL,
            80000.0,
            40000.0,
            10000.0,
            LocalDate.of(2019, 1, 1),
            3,
            5000.0,
            2,
            3,
            5
    );

    @Test
    void getNumberOfExternalPublications() {
        assertEquals(2, individualContributor.getNumberOfExternalPublications());
    }

    @Test
    void getNumberOfPatents() {
        assertEquals(3, individualContributor.getNumberOfPatents());
    }

    @Test
    void getNumberOfPublications() {
        assertEquals(5, individualContributor.getNumberOfPublications());
    }

    @Test
    void estimateProductivity() {
        double expected = 80000.0 / 40000.0 + 1.3 + 1.4 - 0.8;
        double result = individualContributor.estimateProductivity();
        assertEquals(expected, result, 0.001);
    }
}