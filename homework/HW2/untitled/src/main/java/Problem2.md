**Inheritance**
I use inheritance in this homework to model the real life relationships between mail, recipients
and lockers.

*Example of Inheritance*
public class Mail extends Locker {
public Mail(double mailDepth, double mailHeight, double mailWidth, Recipient recipient) {
....
}

**Exceptions**
I used exceptions in this homework to catch edge cases. Like for example in the addMail()
function we can only add mail if the locker is not already full and as long as the mail fits the 
locker. This helps to prevent problems in our program.



*Exampl of Inheritance*
if (this.mail != null) {
throw new IllegalStateException("Locker is occupied");
}
if (mail.getWidth() > lockerWidth || mail.getHeight() > lockerHeight || mail.getDepth() > lockerDepth) {
throw new IllegalArgumentException("Mail exceeds locker dimensions.");
}