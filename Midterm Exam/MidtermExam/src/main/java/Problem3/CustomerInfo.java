package Problem3;

import java.util.Objects;

/*
 Class CustomerInfo contains information about a customer's name, physical address,
 their phone number and email address.
 */
public class CustomerInfo {
  private Name customerName;
  private String streetAndNumber;
  private String city;
  private String state;
  private String ZIPcode;
  private String phoneNumber;
  private String emailAddress;

  public CustomerInfo(Name customerName, String streetAndNumber, String city, String state,
      String ZIPcode, String phoneNumber, String emailAddress) {
    this.customerName = customerName;
    this.streetAndNumber = streetAndNumber;
    this.city = city;
    this.state = state;
    this.ZIPcode = ZIPcode;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  public Name getCustomerName() {
    return customerName;
  }

  public String getStreetAndNumber() {
    return streetAndNumber;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getZIPcode() {
    return ZIPcode;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInfo that = (CustomerInfo) o;
    return Objects.equals(customerName, that.customerName) && Objects.equals(
        streetAndNumber, that.streetAndNumber) && Objects.equals(city, that.city)
        && Objects.equals(state, that.state) && Objects.equals(ZIPcode,
        that.ZIPcode) && Objects.equals(phoneNumber, that.phoneNumber)
        && Objects.equals(emailAddress, that.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, streetAndNumber, city, state, ZIPcode, phoneNumber,
        emailAddress);
  }

  @Override
  public String toString() {
    return "CustomerInfo{" +
        "customerName=" + customerName +
        ", streetAndNumber='" + streetAndNumber + '\'' +
        ", city='" + city + '\'' +
        ", state='" + state + '\'' +
        ", ZIPcode='" + ZIPcode + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", emailAddress='" + emailAddress + '\'' +
        '}';
  }
}
