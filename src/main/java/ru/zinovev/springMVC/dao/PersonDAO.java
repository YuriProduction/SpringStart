package ru.zinovev.springMVC.dao;

import org.springframework.stereotype.Component;
import ru.zinovev.springMVC.models.Person;

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

        people.add(new Person(++PEOPLE_COUNT, "Tom", "TomSurname"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", "BobSurname"));
        people.add(new Person(++PEOPLE_COUNT, "Mike", "MikeSurname"));
        people.add(new Person(++PEOPLE_COUNT, "Katy", "KatySurname"));
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
}