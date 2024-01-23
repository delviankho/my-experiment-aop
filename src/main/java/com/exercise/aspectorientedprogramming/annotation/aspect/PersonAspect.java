package com.exercise.aspectorientedprogramming.annotation.aspect;

import com.exercise.aspectorientedprogramming.dto.Person;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PersonAspect {
    @Before("execution(* com.exercise.aspectorientedprogramming.service.impl.PersonServiceImpl.addPerson(..)) && args(person)")
    public void introduceAgeUpdate(Person person) {
        if (person != null) {
            person.setAge(16);
        }
    }
}
