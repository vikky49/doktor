package Doktor.Find.Model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * A hospital or a nursing home information that the doktor is assosiated with
 */
public class Hospital {

    @Id
    private String hospitalId;

    private String hospitalName;

    private Address address;

    private List<Phone> phoneNumbers;


    public Hospital(
            String hospitalName,
            Address address,
            List<Phone> phoneNumbers) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Phone> getPhoneNumbers() {
        return phoneNumbers;
    }
}
