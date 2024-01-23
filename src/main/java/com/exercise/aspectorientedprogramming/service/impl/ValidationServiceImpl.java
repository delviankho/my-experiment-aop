package com.exercise.aspectorientedprogramming.service.impl;

import org.springframework.stereotype.Service;

import com.exercise.aspectorientedprogramming.service.ValidationService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ValidationServiceImpl implements ValidationService {
    
    @Override
    public void exampleMethod(String param1) {
        log.info(String.format("Service method called with param: %s" , param1));
    }
    
}
