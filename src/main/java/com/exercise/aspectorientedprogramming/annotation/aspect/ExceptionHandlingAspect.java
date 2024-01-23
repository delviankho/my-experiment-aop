package com.exercise.aspectorientedprogramming.annotation.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class ExceptionHandlingAspect {

    @AfterThrowing(pointcut = "execution(* com.exercise.aspectorientedprogramming.service.impl.*.*(..))", throwing = "ex")
    public void handleException(Exception ex) {
        log.error("Exception occurred: {}", ex.getMessage());
    }
}
