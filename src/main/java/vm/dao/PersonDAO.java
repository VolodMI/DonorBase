package vm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import vm.models.Person;

import java.util.ArrayList;
import java.util.List;

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
        jdbcTemplate.update("insert into person VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                person.getName(), person.getAge(),person.getSex(),  person.getEmail(), person.getPhoneNumber(),
                person.getBloodType(), person.getRhD(), person.getDate(), person.getVolume());
    }

    public void update(int id, Person updPerson){
       jdbcTemplate.update("update person set name=?, age = ?, sex=?, email=?, phoneNumber=?, bloodType=?, Rhd =?, date=?, volume = ?  where id=?",
               updPerson.getName(), updPerson.getAge(), updPerson.getSex(), updPerson.getEmail(), updPerson.getPhoneNumber(),
               updPerson.getBloodType(), updPerson.getRhD(), updPerson.getDate(), updPerson.getVolume(), id);
    }

    public  void delete(int id){
        jdbcTemplate.update("delete from person where id=?", id);

    }
//   public void search(Person person){
//       jdbcTemplate.update("select * from person where bloodtype = ? and rhd = ?", person.getBloodType(), person.getRhD());
//   }


}