import Problem2.Locker;
import Problem2.Mail;
import Problem2.Recipient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockerTest {
    private Locker locker;
    private Recipient recipient;
    private Mail mail;

    @BeforeEach
    void setUp() {
        recipient = new Recipient("20th Ave", "Jenny", "Morgan");
        mail = new Mail(2.0, 4.0, 1.6, recipient);
        locker = new Locker(3.0, 5.0, 2.0, mail);
    }

    @Test
    void testAddMailSuccess() {
        locker.addMail(mail);
        assertEquals(mail, locker.pickupMail(recipient));
    }
   //received ai help
    @Test
    void testAddMailToOccupiedLocker() {
        locker.addMail(mail);
        Mail secondMail = new Mail(2.0, 4.0, 1.6, recipient);
        assertThrows(IllegalStateException.class, () -> locker.addMail(secondMail));
    }

    @Test
    void testAddOversizedMail() {
        Mail oversized = new Mail(100.1, 26.0, 16.0, recipient);
        Locker emptyLocker = new Locker(10.0, 25.0, 15.0, oversized);
        assertThrows(IllegalArgumentException.class, () -> emptyLocker.addMail(oversized));
    }

    @Test
    void testPickupMailSuccess() {
        locker.addMail(mail);
        Mail pickedUp = locker.pickupMail(recipient);
        assertEquals(mail, pickedUp);
        assertNull(locker.getMail());
    }

    @Test
    void testPickupMailWrongRecipient() {
        locker.addMail(mail);
        Recipient stranger = new Recipient("Seattle Ave", "Jim", "Joe");
        assertNull(locker.pickupMail(stranger));
    }

    @Test
    void testLockerConstructorInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Locker(11.0, 30.0, 20.0, mail));
    }

    @Test
    void testGetters() {
        assertEquals(3.0, locker.getDepth());
        assertEquals(5.0, locker.getHeight());
        assertEquals(2.0, locker.getWidth());
    }
}
