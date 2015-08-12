package Doktor.Find.Model;

/**
 * Address that denotes the Doktor or the Hospital Address
 */
public class Address {

    private String streetName;

    private String otherReferences;

    private String city;

    private String state;

    private String country;

    private String pinCode;

    public Address(
            String streetName,
            String otherReferences,
            String city,
            String state,
            String country,
            String pinCode) {
        this.streetName = streetName;
        this.otherReferences = otherReferences;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getOtherReferences() {
        return otherReferences;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPinCode() {
        return pinCode;
    }
}
