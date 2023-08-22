package com.spring.sevices;

import com.spring.model.Person;
import com.spring.repository.PersonRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices {

    private PersonRepositroy personRepositroy;

    @Autowired
    public PersonServices(PersonRepositroy personRepositroy) {
        this.personRepositroy = personRepositroy;
    }

    public Person getPersonByName(String name){
       return personRepositroy.findByName(name);
    }
}
