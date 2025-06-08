package Problem1;

public class ContactInfo {
    private Name employeeName;
    private Name emergencyContact;
    private String address;
    private String phoneNumber;
    private String email;

    public ContactInfo(String address, String email, Name emergencyContact, Name employeeName, String phoneNumber) {
        this.address = address;
        this.email = email;
        this.emergencyContact = emergencyContact;
        this.employeeName = employeeName;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Name getEmergencyContact() {
        return emergencyContact;
    }

    public Name getEmployeeName() {
        return employeeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
