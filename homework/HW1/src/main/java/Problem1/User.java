package org.example;

public class User {
    private Credentials credentials;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public User(Credentials credentials, String firstName, String lastName, String phoneNumber, String email) {
        if (phoneNumber == null || phoneNumber.length() != 10) {
            this.phoneNumber = "Invalid";
        } else {
            this.phoneNumber = phoneNumber;
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.credentials = credentials;


    }
    public Credentials getCredentials() {
        return this.credentials;
    }
//getter for first name
    public String getFirstName() {
        return firstName;
    }
//setter for firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//getter for last name
    public String getLastName() {
        return lastName;
    }
//setter for lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 10) {
            this.phoneNumber = "Invalid";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }


}
