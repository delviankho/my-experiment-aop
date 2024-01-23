package com.exercise.aspectorientedprogramming.service.impl;

import org.springframework.stereotype.Service;

import com.exercise.aspectorientedprogramming.service.SecureService;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Service
@Slf4j
public class SecureServiceImpl implements SecureService {

    @Override
    public void secureMethod1() {
        log.info("Performing secureMethod1");
    }

    @Override
    public void secureMethod2() {
        log.info("Performing secureMethod2");
    }
    
}
