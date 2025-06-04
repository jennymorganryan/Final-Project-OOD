import Problem1.BrunchEvent;
import Problem1.DinnerEvent;
import Problem1.Schedule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ScheduleTest {


    private Schedule schedule;
    private BrunchEvent brunch;
    private DinnerEvent dinner;

    @BeforeEach
    void setUp() {
        schedule = new Schedule(LocalDate.of(2025, 5, 29));
        brunch = new BrunchEvent(30, "Jenny", LocalDate.of(2025, 5, 29), 450.0);
        dinner = new DinnerEvent(50, "Morgan", LocalDate.of(2025, 5, 29), 1000.0);

    }

    @Test
    public void testScheduleBooking() {
        schedule.bookBrunchEvent(brunch);
        schedule.bookDinnerEvent(dinner);
        assertEquals(brunch, schedule.getBrunch());
        assertEquals(dinner, schedule.getDinner());
    }

    @Test
    public void testDoubleBookBrunch() {
        schedule.bookBrunchEvent(brunch);
        BrunchEvent anotherBrunch = new BrunchEvent(25, "Eve", LocalDate.of(2025, 5, 29), 400.0);
        assertThrows(IllegalStateException.class, () -> {
            schedule.bookBrunchEvent(anotherBrunch);
        });
    }

    @Test
    public void testDoubleBookDinner() {
        schedule.bookDinnerEvent(dinner);
        DinnerEvent anotherDinner = new DinnerEvent(45, "Lizzy", LocalDate.of(2025, 5, 29), 900.0);
        assertThrows(IllegalStateException.class, () -> {
            schedule.bookDinnerEvent(anotherDinner);
        });
    }
}