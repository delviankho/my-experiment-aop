package com.exercise.aspectorientedprogramming.annotation.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class TransactionAspect {
    @Before("@annotation(jakarta.transaction.Transactional)")
    public void startTransaction() {
        log.info("Transaction Started");
    }

    @After("@annotation(jakarta.transaction.Transactional)")
    public void endTransaction() {
        log.info("Transaction Ended");
    }

    @AfterReturning("@annotation(jakarta.transaction.Transactional)")
    public void commitTransaction() {
        log.info("Transaction Committed");
    }

    @AfterThrowing(value = "@annotation(jakarta.transaction.Transactional)", throwing = "ex")
    public void rollbackTransaction(Exception ex) {
        log.info("Transaction Rolled Back due to: " + ex.getMessage());
    }
}
