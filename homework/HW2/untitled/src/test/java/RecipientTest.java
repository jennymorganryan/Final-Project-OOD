package Problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipientTest {
    private Recipient recipient;

    @BeforeEach
    void setUp() {
        recipient = new Recipient("20th Ave", "Jenny", "Ryan");
    }

    @Test
    void getAddress() {
        assertEquals("20th Ave", recipient.getAddress());
    }

    @Test
    void getFirstName() {
        assertEquals("Jenny", recipient.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Ryan", recipient.getLastName());
    }

    @Test
    void testEquals() {
        Recipient same = new Recipient("20th Ave", "Jenny", "Ryan");
        Recipient different = new Recipient("456 Elm St", "Luke", "Gogo");
        assertEquals(recipient, same);
        assertNotEquals(recipient, different);
    }

}