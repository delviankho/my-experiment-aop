package com.exercise.aspectorientedprogramming.service.impl;

import com.exercise.aspectorientedprogramming.service.ExceptionHandlingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExceptionHandlingServiceImpl implements ExceptionHandlingService {

    @Override
    public void simulateError() {
        try {
            throw new RuntimeException("Simulated Exception");
        } catch (RuntimeException ex) {
            log.error("Exception occurred in simulateError method: {}", ex.getMessage());
            throw ex;
        }
    }
}
