package com.spring.services;

import com.spring.model.Person;
import com.spring.repository.PersonRepositoy;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PersonServices implements Services {

    @Autowired
    private PersonRepositoy personRepositoy;

    @Override
    public List<Person> allPersons (){
        return personRepositoy.findAll();
    }
    @Override
    public void savePerson (Person person){
        personRepositoy.save(person);
    }
    @Override
    public void deletePerson(Long id) {
        personRepositoy.deleteById(id);
    }
    @Override
    public Person showPerson(Long id) {
      return personRepositoy.findById(id).get();
    }

}
