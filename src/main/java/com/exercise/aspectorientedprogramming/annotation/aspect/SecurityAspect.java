package com.exercise.aspectorientedprogramming.annotation.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Aspect
@Slf4j
public class SecurityAspect {

    @Before("execution(* com.exercise.aspectorientedprogramming.service.impl.SecureServiceImpl.*(..))")
    public void checkAuthorization(JoinPoint joinPoint) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info("Checking authorization for: {}", authentication.getName());
    }
}
