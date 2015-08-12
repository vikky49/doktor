package Doktor.Find.Model;

import org.springframework.data.annotation.Id;

/**
 * A typical model that defines the Doctor
 */
public class Doktor {

    /**
     * Denotes the unique id for the doktor
     */
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String speciality;

    private Hospital hospital;

    private Education education;

    private Phone phone;

    //private Constructor. THis has to be constructed
    // through the Buildr pattern
    private Doktor(
            String firstName,
            String lastName,
            String speciality,
            Hospital hospital,
            Education education,
            Phone phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.hospital = hospital;
        this.education = education;
        this.phone = phone;
    }

    public Doktor()
    {

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public Education getEducation() {
        return education;
    }

    public Phone getPhone() {
        return phone;
    }

    public static class Builder {

        private String nestedFirstName;

        private String nestedLastName;

        private String nestedSpeciality;

        private Hospital nestedHospital;

        private Education nestedEducation;

        private Phone nestedPhone;

        public Builder() {

        }

        public Builder setFirstName(String firstName) {
            this.nestedFirstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.nestedLastName = lastName;
            return this;
        }

        public Builder setSpeciality(String speciality) {
            this.nestedSpeciality = speciality;
            return this;
        }

        public Builder setHospital(Hospital hospital) {
            this.nestedHospital = hospital;
            return this;
        }

        public Builder setPhone(Phone phone) {
            this.nestedPhone = phone;
            return this;
        }

        public Builder setEducation(Education education) {
            this.nestedEducation = education;
            return this;
        }

        public Doktor build() {
            return new Doktor(
                    nestedFirstName,
                    nestedLastName,
                    nestedSpeciality,
                    nestedHospital,
                    nestedEducation,
                    nestedPhone);
        }
    }

}
