package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.ExceptionHandlingServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ExceptionHandlingServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, ExceptionHandlingService.class})
class ExceptionHandlingServiceTest {

    @Autowired
    private ExceptionHandlingService exceptionHandlingService;

    @Test
    void test_simulateError_success(){
        exceptionHandlingService.simulateError();
    }

}
