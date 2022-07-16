package vm.dao;

import org.springframework.jdbc.core.RowMapper;
import vm.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Person person = new Person();

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setAge(resultSet.getInt("age"));
        person.setEmail(resultSet.getString("email"));
        person.setBloodType(resultSet.getString("bloodtype"));
        person.setVolume(resultSet.getInt("volume"));
        person.setSex(resultSet.getString("sex"));
        person.setDate(resultSet.getString("date"));
        person.setRhD(resultSet.getString("rhd"));
        person.setPhoneNumber(resultSet.getString("phonenumber"));



        return person;
    }
}

