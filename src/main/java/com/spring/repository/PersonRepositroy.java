package com.spring.repository;


import com.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource
public interface PersonRepositroy extends JpaRepository<Person,Long> {

    //http://localhost:8080/persons/search/findByName?name=Gavi
    Person findByName(@RequestParam String name);

    //http://localhost:8080/persons/search/findByAge?age=18
    Person findByAge (@RequestParam int age);

    //http://localhost:8080/persons/search/findByNumber?number=8
    List<Person> findByNumber(@RequestParam int number);//هنا عملت لست عشان في كذا حد ليه رقم 8


 /*


        Get      http://localhost:8080/persons
        Get      http://localhost:8080/persons/id
        Post     http://localhost:8080/persons      body Player
        Put      http://localhost:8080/persons      body Player
        Delete   http://localhost:8080/persons/id


        sort     http://localhost:8080/persons?sort=id,esc


 */
}
