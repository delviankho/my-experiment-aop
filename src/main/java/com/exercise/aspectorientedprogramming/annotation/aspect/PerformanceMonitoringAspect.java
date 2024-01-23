package com.exercise.aspectorientedprogramming.annotation.aspect;

import com.exercise.aspectorientedprogramming.annotation.PerformanceMonitor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class PerformanceMonitoringAspect {

    @Around("@annotation(performanceMonitor)")
    public Object monitorPerformance(ProceedingJoinPoint joinPoint, PerformanceMonitor performanceMonitor) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        log.info("Method: {} | Execution Time: {} ms", joinPoint.getSignature().toShortString(), executionTime);

        return result;
    }
    
}
