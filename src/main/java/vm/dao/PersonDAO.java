package vm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import vm.models.Person;

import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Person> index() {
        return jdbcTemplate.query("select * from person", new PersonMapper());

    }

    public Person show(int id) {
        return jdbcTemplate.query("select * from person where id = ?",new Object[]{id},
                new PersonMapper()).stream().findAny().orElse(null);
    }

    public void save(Person person) {
        jdbcTemplate.update("insert into person VALUES (?, ?, ?)", person.getName(), person.getAge(), person.getEmail());

    }
    public void update(int id, Person updPerson){
       jdbcTemplate.update("update person set name=?, age = ?, email=? where id=?",
               updPerson.getName(), updPerson.getAge(), updPerson.getEmail(), id);
    }
    public  void delete(int id){
        jdbcTemplate.update("delete from person where id=?", id);


    }
}