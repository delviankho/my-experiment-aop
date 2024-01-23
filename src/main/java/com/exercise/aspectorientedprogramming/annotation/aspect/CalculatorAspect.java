package com.exercise.aspectorientedprogramming.annotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorAspect {
    @Before("execution(* com.exercise.aspectorientedprogramming.service.impl.CalculatorServiceImpl.add(..))")
    public void beforeAdd() {
        System.out.println("Before calling add method...");
    }

    @After("execution(* com.exercise.aspectorientedprogramming.service.impl.CalculatorServiceImpl.add(..))")
    public void afterAdd() {
        System.out.println("After calling add method...");
    }
}