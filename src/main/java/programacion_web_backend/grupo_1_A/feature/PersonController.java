package programacion_web_backend.grupo_1_A.feature;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@CrossOrigin({ "*" })
public class PersonController {
    @Autowired
    PersonService personService;

    // Get
    @GetMapping("/{id}")
    public Person findById(@PathVariable Long id) {
        return personService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Person> findAll() {
        return personService.findAll();
    }
    // Post

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person person) {
        return personService.save(person);
    }

    // Update

    @PutMapping("/update")
    public Person updatPerson(@RequestBody Person person) {
        return personService.save(person);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePerson(@PathVariable Long id) {
        personService.deleteById(id);
    }

}
