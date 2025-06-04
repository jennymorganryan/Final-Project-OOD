**Inheritance**:
In this homework, I used inheritance to model different types
of events. The base class Event contains properties common to all events, 
such as attendees, customerName, date, and estimatedCateringCost. 
Subclasses like BrunchEvent, DinnerEvent, and Schedule extend the Event class 
to inherit these properties and behaviors.

*example code snippet for inheritance*:
public class BrunchEvent extends Event {
public BrunchEvent(int attendees, String customerName, LocalDate date, double estimatedCateringCost) {
super(attendees, customerName, date, estimatedCateringCost);
...
}


**Exceptions**:
I used exceptions in this homework to catch edge cases such as making sure the
number of attendees are valid.


*Example code snippet*
if (attendees > 65 || attendees < 5) {
throw new IllegalArgumentException("Brunch attendees must be between 5 and 65");
}

