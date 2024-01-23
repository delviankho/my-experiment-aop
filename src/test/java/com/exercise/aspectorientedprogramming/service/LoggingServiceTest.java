package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.LoggingServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = LoggingServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, LoggingService.class})
class LoggingServiceTest {

    @Autowired
    private LoggingService loggingService;

    @Test
    void test_doProcess1_success(){
        loggingService.doProcess1();
    }

    @Test
    void test_doProcess2_success(){
        loggingService.doProcess2();
    }

    @Test
    void test_doProcess3_success(){
        loggingService.doProcess3();
    }

}
