package com.spring.controller;

import com.spring.model.Person;
import com.spring.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private PersonServices personServices;

    @Autowired
    public PersonController(PersonServices personServices) {
        this.personServices = personServices;
    }
    // http://localhost:8080/api/players
    @GetMapping("/players")
    public List<Person> getPlayers(){
        return personServices.allPersons();
    }

    // http://localhost:8080/api/players/id
    @GetMapping("/players/{id}")
    public Person getPlayerById(@PathVariable("id")Long id) {
        Person p = personServices.showPerson(id); //  //
        if(p == null) {
            throw new RuntimeException("Player Not Found id: " + id);
        }
        return p;
    }

    @PostMapping("/players")
    public String savaPlayer(@RequestBody Person player) {
        personServices.savePerson(player);
        return "Success Added";
    }

    // http://localhost:8080/api/players
    @PutMapping("/players")
    public String editPlayer(@RequestBody Person player) {
        personServices.savePerson(player);
        return "Success editing";
    }

    @DeleteMapping("/players/{id}")
    public void removePlayer(@PathVariable("id")Long id) {
        personServices.deletePerson(id);
    }
}
