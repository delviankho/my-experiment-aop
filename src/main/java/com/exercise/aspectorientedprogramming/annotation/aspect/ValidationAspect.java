package com.exercise.aspectorientedprogramming.annotation.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ValidationAspect {

    @Before("execution(* com.exercise.aspectorientedprogramming.service.impl.*.*(..)) && args(param)")
    public void validateParameters(JoinPoint joinPoint, Object param) {
        if (param == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }

        log.info("Parameter for {} detected: {}", joinPoint.getSignature().getName(), param);
    }
}
