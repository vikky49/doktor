package Doktor.Find.Model;

/**
 * A data structure to hold the phone number kind of information
 */
public class Phone {

    private String phoneType;

    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
