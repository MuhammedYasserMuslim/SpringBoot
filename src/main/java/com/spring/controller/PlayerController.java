package com.spring.controller;

import com.spring.model.Person;
import com.spring.sevices.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/agents
@RestController
@RequestMapping("/agents")
public class PlayerController {

    PersonServices personServices;

    @Autowired
    public PlayerController(PersonServices personServices) {
        this.personServices = personServices;
    }
    //http://localhost:8080/agents/agent?name=
    @GetMapping("/agent")
    public Person GetPersonByNam(@RequestParam String name){
      return  personServices.getPersonByName(name);
    }
}
