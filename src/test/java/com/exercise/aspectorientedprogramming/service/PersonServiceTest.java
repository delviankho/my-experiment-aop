package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.dto.Person;
import com.exercise.aspectorientedprogramming.service.impl.PersonServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PersonServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, PersonService.class})
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    void test_addPersonSuccess(){
        Person person = Person.builder().name("Delvian").build();
        System.out.printf("Before Name %s Age %d%n", person.getName(), person.getAge());

        Person personReturn = personService.addPerson(person);
        System.out.printf("After Name %s Age %d%n", personReturn.getName(), personReturn.getAge());
    }
}
