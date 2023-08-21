package com.spring.services;

import com.spring.model.Person;
import java.util.List;
public interface Services {
    public List<Person> allPersons ();

    public void savePerson(Person player);

    public Person showPerson(Long id);

    public void deletePerson(Long id);
}
