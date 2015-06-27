package Doktor;

import Doktor.Find.Model.Doktor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DoktorRepository extends MongoRepository<Doktor, String> {

    List<Doktor> findByFirstName(String firstName);

    List<Doktor> findByLastName(String lastName);

}
