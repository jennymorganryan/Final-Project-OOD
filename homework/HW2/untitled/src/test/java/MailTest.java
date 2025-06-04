import Problem2.Mail;
import Problem2.Recipient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailTest {
    private Mail mail;
    private Recipient recipient;
    @BeforeEach
    void setUp() {
        recipient = new Recipient("123 Main St", "Jenny", "Ryan");
        mail = new Mail(3.0, 4.0, 2.0, recipient); // depth, height, width
    }

    @Test
    void testGetDepth() {
        assertEquals(3.0, mail.getDepth());
    }

    @Test
    void testGetHeight() {
        assertEquals(4.0, mail.getHeight());
    }

    @Test
    void testGetWidth() {
        assertEquals(2.0, mail.getWidth());
    }

    @Test
    void testGetRecipient() {
        assertEquals(recipient, mail.getRecipient());
    }

}