package org.data;
import org.models.person.Person;

import java.util.ArrayList;
import java.util.List;

public class ListPersons {
    List<Person> persons = new ArrayList<>();
    public void add(Person person){
        persons.add(person);
    }
    public List<Person> getPersons(){
        return persons;
    }

}
