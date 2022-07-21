package sg.edu.nus.iss.day13revision.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.util.*;
import sg.edu.nus.iss.day13revision.models.*; //import model

//SERVICE


@Service
public class PersonService {
    private List<Person> persons = new ArrayList<>();


    public PersonService() {

        persons.add(new Person("Mark", "zukerberg"));
        persons.add(new Person("Elon", "Mush"));
        persons.add(new Person("Donald", "Trump"));

 }

    public List<Person> getPersons(){
        return this.persons;

    
    }
    public void addPerson (Person p){
        persons.add(new Person(p.getFirstName(),p.getLastName()));
    }
    
}
