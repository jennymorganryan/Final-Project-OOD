package org.example.Problem3;

/**
 * The type Identifier.
 */
public class Identifier {
    private String username;
    private Integer yearCreated;
    private String country;

    /**
     * Instantiates a new Identifier.
     *
     * @param username    the username
     * @param yearCreated the year created
     * @param country     the country
     */
    public Identifier(String username, int yearCreated, String country) {
        this.username = username;
        this.yearCreated = yearCreated;
        this.country = country;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets year created.
     *
     * @return the year created
     */
    public int getYearCreated() {
        return yearCreated;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }
}

