import Problem3.Name;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import problem2.Superhero;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {
private problem2.Superhero superhero;
private Name name;


    @BeforeEach
    void setUp() {
        List<String> Powers;
        name = new Name("Jenny", "Hawaii", "Rockerfeller");
        superhero = new Superhero(name, 26, 1.7, 134.5, List.of("Strength", "Determination", "Resilience", "Running", "Gym", "Reading", "Traveling", "Spanish", "Experiencing", "Art", "Pottery"), List.of("Land", "Sea"), LocalDate.of(2025, 12, 07), 98.5, 99.3);
//TODO due to time constraints- instantiating my list in a better manner! Once this is fixed my test will run

    }

    @Test
    void addNewPower() throws problem2.InvalidAbilityException {
        superhero.addNewPower("Happiness");

        assertEquals(superhero.getPowers().size(), 3);
    }

    @Test
    void updateDateOfLastBattle() {
        assertEquals(superhero.updateDateOfLastBattle(LocalDate.of(2025, 05, 01)), false);

        superhero.updateDateOfLastBattle(LocalDate.of(2025, 10, 01));
        assertEquals(superhero.getDateOfLastBattle(), LocalDate.of(2025, 10, 01));
    }
}