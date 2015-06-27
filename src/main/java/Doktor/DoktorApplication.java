package Doktor;

import Doktor.Find.Model.Address;
import Doktor.Find.Model.Doktor;
import Doktor.Find.Model.Education;
import Doktor.Find.Model.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoktorApplication implements CommandLineRunner {

    @Autowired
    private DoktorRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DoktorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        //Create some dummy data of doktors

        Doktor doktor1 = new Doktor.Builder()
                .setFirstName("pratyush")
                .setLastName("Malneedi")
                .setEducation(new Education("XY", "MD", "cardio", null))
                .setHospital(new Hospital("Fancy",
                        new Address("stree1", null, "vijayawada", "AP", "India", "52008"), null))
                .setSpeciality("cardio")
                .build();

        Doktor doktor2 = new Doktor.Builder()
                .setFirstName("AJJ")
                .setLastName("Test")
                .setEducation(new Education("XY", "MS", "Dentist", null))
                .setHospital(new Hospital("Fancy",
                        new Address("stree1", null, "vijayawada", "AP", "India", "52008"), null))
                .setSpeciality("Dentist")
                .build();

        Doktor doktor3 = new Doktor.Builder()
                .setFirstName("PRA")
                .setLastName("MEN")
                .setEducation(new Education("XY", "MS", "pediatrist", null))
                .setHospital(new Hospital("Fancy",
                        new Address("stree1", null, "vijayawada", "AP", "India", "52008"), null))
                .setSpeciality("Pediatrist")
                .build();

        repository.save(doktor1);
        repository.save(doktor2);
        repository.save(doktor3);

        //Now fetch all doktors
        System.out.println("Doktors found with findAll():");
        System.out.println("-------------------------------");
        repository.findAll().forEach(System.out::println);
        System.out.println();

        // fetch an individual Doktor
        System.out.println("Customer found with findByFirstName('pratyush'):");
        System.out.println("--------------------------------");
        repository.findByFirstName("pratyush").forEach(System.out::println);

        System.out.println("Doktors found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        repository.findByLastName("MEN").forEach(System.out::println);
    }
}
