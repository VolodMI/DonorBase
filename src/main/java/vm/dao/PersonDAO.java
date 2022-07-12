package vm.dao;

import org.springframework.stereotype.Component;
import vm.models.Person;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 23, "tom@gmail.com"));

    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
    public void update(int id, Person updPerson){
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updPerson.getName());
        personToBeUpdated.setAge(updPerson.getAge());
        personToBeUpdated.setEmail(updPerson.getEmail());
    }
    public  void delete(int id){
        people.removeIf(p -> p.getId()==id);
    }
}