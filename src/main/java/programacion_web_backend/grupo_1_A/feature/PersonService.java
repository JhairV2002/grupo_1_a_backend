package programacion_web_backend.grupo_1_A.feature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(long id) {
        return personRepository.findById(id).orElse(new Person());
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Person update(Person person) {
        return personRepository.save(person);
    }

    public void deleteById(long id) {
        personRepository.deleteById(id);
    }
}
