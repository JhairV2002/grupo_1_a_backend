package programacion_web_backend.grupo_1_A.feature;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findAll();
}
