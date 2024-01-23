package com.exercise.aspectorientedprogramming.annotation.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class LoggingAspect {

    @After("execution(* com.exercise.aspectorientedprogramming.service.impl.*.*(..))")
    public void logAfterMethodExecution(JoinPoint joinPoint) {
        log.info("JoinPoint Method executed: {}", joinPoint.getSignature().toShortString());
        log.info("JoinPoint Method name: {}", joinPoint.getSignature().getName());
        log.info("JoinPoint Class name: {}", joinPoint.getSignature().getDeclaringTypeName());
        log.info("JoinPoint Arguments: {}", joinPoint.getArgs());
        log.info("JoinPoint Target: {}", joinPoint.getTarget());
        log.info("Join Point Long String : {}", joinPoint.toLongString());
    }
}
