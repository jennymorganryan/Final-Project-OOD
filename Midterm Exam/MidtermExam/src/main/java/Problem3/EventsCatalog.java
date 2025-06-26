package Problem3;

import Problem3.Event;
import Problem3.InvalidEventIDException;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;


/**
 * The type Events catalog
 */
public class EventsCatalog {

    protected Event[] events = new Event[];

    /**
     * Instantiates a new Events catalog.
     *
     * @param events - event objects stored in an array
     */

    public EventsCatalog(Event[] events) {
        this.events = events;
    }

    /**
     * Find event by id event.
     *
     * @param id - the id representing a unique event code as an integer
     * @return the event
     */
    public Event findEventByID(int id) {
        for (int i = 0; i < events.length; i++) {
            if (events[i].getEventID() == id) {
                return events[i];
            }
        }
        throw new InvalidEventIDException("Invalid event ID!");
    }

    /**
     * Return valid events event [ ].
     *
     * @param requestedDate the requested date as a date
     * @return the event [ ]
     */
    public Event[] returnValidEvents(LocalDate requestedDate) {
        Event[] validEvents = new Event[];
        for (int i = 0; i < events.length; i++) {
            if (events[i].getEventDate().isEqual(requestedDate)) {
                validEvents[i] = events[i];
            }
        }
        return validEvents;
    }

    /**
     * Add event.
     *
     * @param event the event we would like to add
     */
    public void addEvent(Event event) {
        Event[] newArr = new Event[];

        for (int i = 0; i < this.events.length + 1; i++) {
            if (i == this.events.length) {
                newArr[i] = event;
                return;
            }
            newArr[i] = this.events[i];
        }
    }

    /**
     * Count events int.
     *
     * @return the int
     */
    public int countEvents() {
        return events.length;
    }

    /**
     * Get events event [ ].
     *
     * @return the event [ ]
     */
    public Event[] getEvents() {
        return events;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EventsCatalog that)) return false;
        return Objects.deepEquals(events, that.events);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(events);
    }

    @Override
    public String toString() {
        return "EventsCatalog{" +
                "events=" + Arrays.toString(events) +
                '}';
    }
}
