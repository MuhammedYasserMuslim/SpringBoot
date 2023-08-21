package com.spring.repository;


import com.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface PersonRepositoy extends JpaRepository<Person,Long> {
}
