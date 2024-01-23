package com.exercise.aspectorientedprogramming.service.impl;

import org.springframework.stereotype.Service;

import com.exercise.aspectorientedprogramming.service.TransactionalService;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TransactionalServiceImpl implements TransactionalService {

    @Transactional
    @Override
    public void myTransactionalMethod() {
        log.info("Performing myTransactionalMethod");
    }

    @Transactional
    @Override
    public void myTransactionalMethod2() {
        try {
            throw new RuntimeException("Simulated Transactional Exception");
        } catch (RuntimeException ex) {
            log.error("Exception occurred in simulateError Transactional method: {}", ex.getMessage());
            throw ex;
        }
    }
    
}
