package Problem3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

/**
 * Class Event contains information about an Event, including event's unique ID, event name, the
 * name of the event manager in charge of leading the event, the names of the team organizing the
 * event, the contact information about the customer, the date of the event, the expected number of
 * guests, and the expected duration of the event in hours.
 */
public class Event {

  private Integer eventID;
  private String eventName;
  private Name leadEventManager;
  private Name[] eventTeam;
  private CustomerInfo customerContact;
  private LocalDate eventDate;
  private Integer numGuests;
  private Integer duration;

  public Event(Integer eventID, String eventName, Name leadEventManager, Name[] eventTeam,
               CustomerInfo customerContact, LocalDate eventDate, Integer numGuests,
               Integer duration) {
    this.eventID = eventID;
    this.eventName = eventName;
    this.leadEventManager = leadEventManager;
    this.eventTeam = eventTeam;
    this.customerContact = customerContact;
    this.eventDate = eventDate;
    this.numGuests = numGuests;
    this.duration = duration;
  }

  public Integer getEventID() {
    return eventID;
  }

  public void setEventID(Integer eventID) {
    this.eventID = eventID;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Name getLeadEventManager() {
    return leadEventManager;
  }

  public void setLeadEventManager(Name leadEventManager) {
    this.leadEventManager = leadEventManager;
  }

  public Name[] getEventTeam() {
    return eventTeam;
  }

  public void setEventTeam(Name[] eventTeam) {
    this.eventTeam = eventTeam;
  }

  public CustomerInfo getCustomerContact() {
    return customerContact;
  }

  public void setCustomerContact(CustomerInfo customerContact) {
    this.customerContact = customerContact;
  }

  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }

  public Integer getNumGuests() {
    return numGuests;
  }

  public void setNumGuests(Integer numGuests) {
    this.numGuests = numGuests;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(eventID, event.eventID) && Objects.equals(eventName,
        event.eventName) && Objects.equals(leadEventManager, event.leadEventManager)
        && Arrays.equals(eventTeam, event.eventTeam) && Objects.equals(
        customerContact, event.customerContact) && Objects.equals(eventDate,
        event.eventDate) && Objects.equals(numGuests, event.numGuests)
        && Objects.equals(duration, event.duration);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(eventID, eventName, leadEventManager, customerContact, eventDate,
        numGuests, duration);
    result = 31 * result + Arrays.hashCode(eventTeam);
    return result;
  }

  @Override
  public String toString() {
    return "Event{" +
        "eventID=" + eventID +
        ", eventName='" + eventName + '\'' +
        ", leadEventManager=" + leadEventManager +
        ", eventTeam=" + Arrays.toString(eventTeam) +
        ", customerContact=" + customerContact +
        ", eventDate=" + eventDate +
        ", numGuests=" + numGuests +
        ", duration=" + duration +
        '}';
  }
}
