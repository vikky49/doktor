package Doktor.Find.Model;

/**
 * This model denotes the schooling and all the degrees that the Doktor has received
 */
public class Education {

    private String university;

    private String degree;

    private String specialization;

    private String otherSpecilizations;

    public Education(
            String university,
            String degree,
            String specialization,
            String otherSpecilizations) {

        this.university = university;
        this.degree = degree;
        this.specialization = specialization;
        this.otherSpecilizations = otherSpecilizations;
    }

    public String getUniversity() {
        return university;
    }

    public String getDegree() {
        return degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getOtherSpecilizations() {
        return otherSpecilizations;
    }
}

