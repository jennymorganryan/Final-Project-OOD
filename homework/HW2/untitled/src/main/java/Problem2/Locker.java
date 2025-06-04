package Problem2;

import java.util.Objects;

/**
 * The type Locker.
 */
public class Locker {
    private double lockerWidth;
    private double lockerHeight;
    private double lockerDepth;
    private Mail mail;

    /**
     * Instantiates a new Locker.
     *
     * @param lockerDepth  the locker depth
     * @param lockerHeight the locker height
     * @param lockerWidth  the locker width
     * @param mail         the mail
     */
    public Locker(double lockerDepth, double lockerHeight, double lockerWidth, Mail mail) {
        if (lockerWidth <= 15 && lockerHeight <= 25 && lockerDepth <= 10) {
            this.lockerDepth = lockerDepth;
            this.lockerHeight = lockerHeight;
            this.lockerWidth = lockerWidth;
            this.mail = null;
        } else {
            throw new IllegalArgumentException("Invalid arguments.");
        }
    }

    /**
     * Gets mail.
     *
     * @return the mail
     */
    public Mail getMail() {
        return mail;
    }

    /**
     * add mail
     *
     * @param mail the mail
     * @return the mail
     */
    public void addMail(Mail mail) {
        if (this.mail != null) {
            throw new IllegalStateException("Locker is occupied");
        }
        if (mail.getWidth() > lockerWidth || mail.getHeight() > lockerHeight || mail.getDepth() > lockerDepth) {
            throw new IllegalArgumentException("Mail exceeds locker dimensions.");
        }
        this.mail = mail;
    }

    /**
     * Pickup mail mail.
     *
     * @param recipient the recipient
     * @return the mail
     */
    public Mail pickupMail(Recipient recipient) {
        if (this.mail != null && this.mail.getRecipient().equals(recipient)) {
            Mail toReturn = this.mail;
            this.mail = null;
            return toReturn;
        }
        return null;
    }

    /**
     * Gets depth.
     *
     * @return the depth
     */
    public double getDepth() {
        return lockerDepth;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public double getHeight() {
        return lockerHeight;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public double getWidth() {
        return lockerWidth;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Locker locker = (Locker) o;
        return Double.compare(lockerWidth, locker.lockerWidth) == 0 && Double.compare(lockerHeight, locker.lockerHeight) == 0 && Double.compare(lockerDepth, locker.lockerDepth) == 0 && Objects.equals(mail, locker.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockerWidth, lockerHeight, lockerDepth, mail);
    }
}
