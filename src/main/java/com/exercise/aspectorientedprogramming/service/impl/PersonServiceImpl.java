package com.exercise.aspectorientedprogramming.service.impl;

import com.exercise.aspectorientedprogramming.dto.Person;
import com.exercise.aspectorientedprogramming.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person addPerson(Person person) {
        return person;
    }
}
