package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.ValidationServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ValidationServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, ValidationService.class})
class ValidationServiceTest {
    @Autowired
    private ValidationService validationService;

    @Test
    void test_exampleMethod_success(){
        String param = "Test Param";
        validationService.exampleMethod(param);
    }

    @Test
    void test_exampleMethod_throwException(){
        validationService.exampleMethod(null);
    }
}
