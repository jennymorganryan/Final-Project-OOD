import Problem3.EventsCatalog;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import Problem3.Event;
import Problem3.Name;
import Problem3.CustomerInfo;


class EventsCatalogTest {

    @BeforeAll
    static void beforeAll() {
        Name billy = new Name("Billy", "Marcus", "Dale");
        Name fred = new Name("Fred", "Jane", "Smith");
        Name vicky = new Name("Vicky", "Jane", "Soronto");
        Name sadie = new Name("Sadie", "Mary", "Goldsmith");

        CustomerInfo customerinfo = new CustomerInfo(sadie, "Snowy Creek Dr.", "Boston", "MA", "02120", "6146409287", "vicky@gmail.com");

        Name[] team = new Name[];

        Event event1 = new Event(599, "wedding", fred, team, customerinfo, LocalDate.now(), 20,6);
        Event event2 = new Event(700, "concert", vicky, team, customerinfo, LocalDate.now(), 60,6);



        EventsCatalog eventsCatalog = new EventsCatalog(List.of(event1, event2));

    }

    @Test
    void findEventByID() {
        for (int i = 0; i <  2; i++ ) {
            if (eventsCatalog[i].get)
        }
    }

    @Test
    void countEvents() {
    }
}