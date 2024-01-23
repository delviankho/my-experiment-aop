package com.exercise.aspectorientedprogramming.annotation.aspect;

import com.exercise.aspectorientedprogramming.annotation.AuditTrail;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class AuditTrailAspect {

    @Around("@annotation(auditTrail)")
    public Object auditTrail(ProceedingJoinPoint joinPoint, AuditTrail auditTrail) throws Throwable {
        String action = auditTrail.action();
        String description = auditTrail.description();

        log.info("ProceedingJoinPoint Method executed: {}", joinPoint.getSignature().toShortString());
        log.info("ProceedingJoinPoint Method name: {}", joinPoint.getSignature().getName());
        log.info("ProceedingJoinPoint Class name: {}", joinPoint.getSignature().getDeclaringTypeName());
        log.info("ProceedingJoinPoint Arguments: {}", joinPoint.getArgs());
        log.info("ProceedingJoinPoint Target: {}", joinPoint.getTarget());
        log.info("ProceedingJoinPoint Join Point Long String : {}", joinPoint.toLongString());

        log.info("Audit Log - Action: {}, Description {} ", action, description);

        Object result = joinPoint.proceed();

        log.info("Audit Log - Action: {}, Description: {} - Completed", action, description);

        return result;
    }
}
