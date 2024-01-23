package com.exercise.aspectorientedprogramming.service.impl;

import org.springframework.stereotype.Service;

import com.exercise.aspectorientedprogramming.service.LoggingService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoggingServiceImpl implements LoggingService {

    @Override
    public void doProcess1() {
        log.info("Do Process 1");
    }

    @Override
    public void doProcess2() {
        log.info("Do Process 2");
    }

    @Override
    public void doProcess3() {
        log.info("Do Process 3");
    }
    
}
