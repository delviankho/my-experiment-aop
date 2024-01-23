package com.exercise.aspectorientedprogramming.service;

import com.exercise.aspectorientedprogramming.config.AppConfig;
import com.exercise.aspectorientedprogramming.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CalculatorServiceImpl.class)
@ContextConfiguration(classes = {AppConfig.class, CalculatorService.class})
public class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @Test
    void test_calculate_success(){
        int a = 10;
        int b = 2;

        int addResult = calculatorService.add(a,b);
        int subtractResult = calculatorService.subtract(a,b);
        int divideResult = calculatorService.divide(a,b);
        int multiplyResult = calculatorService.multiply(a,b);

        System.out.printf("Add Result %d\n", addResult);
        System.out.printf("Subtract Result %d\n", subtractResult);
        System.out.printf("Divide Result %d\n", divideResult);
        System.out.printf("Multiply Result %d\n", multiplyResult);
    }
}
