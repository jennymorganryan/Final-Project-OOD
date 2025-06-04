package Problem2;

import java.util.Objects;

/**
 * The type Mail.
 */
public class Mail extends Locker {
    private double mailWidth;
    private double mailHeight;
    private double mailDepth;
    private Recipient recipient;

    /**
     * Instantiates a new Mail.
     *
     * @param mailDepth  the mail depth
     * @param mailHeight the mail height
     * @param mailWidth  the mail width
     * @param recipient  the recipient
     */
    public Mail(double mailDepth, double mailHeight, double mailWidth, Recipient recipient) {
        if (mailWidth >= 1.5 && mailHeight >= 2 && mailDepth >= 1) {
            this.mailDepth = mailDepth;
            this.mailHeight = mailHeight;
            this.mailWidth = mailWidth;
            this.recipient = recipient;

        } else {
            throw new IllegalArgumentException("Invalid mail arguments");
        }
    }


    /**
     * Gets depth.
     *
     * @return the depth
     */
    public double getDepth() {
        return mailDepth;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public double getHeight() {
        return mailHeight;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return mailWidth;
    }

    /**
     * Gets recipient.
     *
     * @return the recipient
     */
    public Recipient getRecipient() {
        return recipient;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail = (Mail) o;
        return Double.compare(mailWidth, mail.mailWidth) == 0 && Double.compare(mailHeight, mail.mailHeight) == 0 && Double.compare(mailDepth, mail.mailDepth) == 0 && Objects.equals(recipient, mail.recipient);
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mailDepth=" + mailDepth +
                ", mailWidth=" + mailWidth +
                ", mailHeight=" + mailHeight +
                ", recipient=" + recipient +
                '}';
    }
}
